package cn.happymall.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.DefaultCookieSerializer;  
  
@Configuration
@PropertySource("classpath:config/session.properties")  
@EnableRedisHttpSession
public class RedisSessionConfig {
	
	@Value("${server.session.cookie.name}")
    String cookieName;
	@Value("${server.session.cookie.domain}")
    String domainName;
	@Value("${server.session.cookie.http-only}")
    boolean httpOnly;
	@Value("${server.session.cookie.path}")
	String cookiePath;
	
	
	@Bean  
    public DefaultCookieSerializer DefaultCookieSerializer() {  
        DefaultCookieSerializer customerCookieSerializer = new DefaultCookieSerializer();
        customerCookieSerializer.setCookieName(cookieName);
        customerCookieSerializer.setDomainName(domainName);
        customerCookieSerializer.setUseHttpOnlyCookie(httpOnly);
        customerCookieSerializer.setCookiePath(cookiePath);
        return customerCookieSerializer;  
    }
	
	@Bean
	public static ConfigureRedisAction configureRedisAction() {
	    return ConfigureRedisAction.NO_OP;
	}
  
}