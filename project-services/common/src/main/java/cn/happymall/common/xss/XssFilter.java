package cn.happymall.common.xss;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Set;
import com.alibaba.druid.util.PatternMatcher;
import com.alibaba.druid.util.ServletPathMatcher;
import java.util.Arrays;
import java.util.HashSet;

/**
 * XSS过滤
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2017-04-01 10:20
 */
public class XssFilter implements Filter {

	/**
	 * Constant <code>PARAM_NAME_EXCLUSIONS="ds.exclusions"</code>
	 */
	public static final String PARAM_NAME_EXCLUSIONS = "exclusions";

	private static Set<String> excludesPattern;

	protected static PatternMatcher pathMatcher = new ServletPathMatcher();

	@Override
	public void init(FilterConfig config) throws ServletException {
		String exclusions = config.getInitParameter(PARAM_NAME_EXCLUSIONS);
		if (exclusions != null && exclusions.trim().length() != 0) {
			excludesPattern = new HashSet<String>(Arrays.asList(exclusions.split("\\s*,\\s*")));
		}
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
//		XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(
//				(HttpServletRequest) request);
//		chain.doFilter(xssRequest, response);

		String requestURI = ((HttpServletRequest) request).getRequestURI().replaceAll("//","/");
		String contextPath = ((HttpServletRequest) request).getContextPath();

		if (isExclusion(requestURI, contextPath)) {
			chain.doFilter(request, response);
		}else{
			XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper((HttpServletRequest) request);
			chain.doFilter(xssRequest, response);
		}	}

	@Override
	public void destroy() {
	}

	/**
	 * <p>isExclusion.</p>
	 *
	 * @param requestURI a {@link java.lang.String} object.
	 * @param contextPath a {@link java.lang.String} object.
	 * @return a boolean.
	 */
	public boolean isExclusion(String requestURI, String contextPath) {

		if (excludesPattern == null) {
			return false;
		}

		if (contextPath != null && requestURI.startsWith(contextPath)) {
			requestURI = requestURI.substring(contextPath.length());
			if (!requestURI.startsWith("/")) {
				requestURI = "/" + requestURI;
			}
		}

		for (String pattern : excludesPattern) {
			if (pathMatcher.matches(pattern, requestURI)) {
				return true;
			}
		}

		return false;
	}
}