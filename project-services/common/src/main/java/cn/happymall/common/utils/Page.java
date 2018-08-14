package cn.happymall.common.utils;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-10-19 11:30:28
 */
public class Page<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	public final static int DEFAULT_PAGE_SIZE = 10;

	//每页记录数
	@ApiModelProperty(value="每页记录数")
	private int pageSize = DEFAULT_PAGE_SIZE;
	//总记录数
	@ApiModelProperty(value="总记录数")
	private int totalCount;
	//总页数
	@ApiModelProperty(value="总页数")
	private int totalPage;
	//当前页数
	@ApiModelProperty(value="当前页数")
	private int currPage;
	//列表数据
	@ApiModelProperty(value="列表数据")
	private List<T> list;

	/**
	 * 分页
	 * @param list        列表数据
	 * @param totalCount  总记录数
	 * @param pageSize    每页记录数
	 * @param currPage    当前页数
	 */
	public Page(List<T> list, int totalCount, int pageSize, int currPage) {
		this.list = list;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currPage = currPage;
		this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
