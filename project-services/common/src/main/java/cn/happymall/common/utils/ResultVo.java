package cn.happymall.common.utils;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.http.HttpStatus;

import io.swagger.annotations.ApiModelProperty;

/**
 * 响应结果数据展示对象
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-10-19 15:54:24
 */
public class ResultVo<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="编码：0-成功；1-失败")
	public int code = 0;
	@ApiModelProperty(value="消息说明：操作成功；查询成功；操作失败；添加失败 ...")
	public String msg = "操作成功"; 
	@ApiModelProperty(value="数据结果")
	public T data;


	public static ResultVo error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}

	public static ResultVo error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}

	public static ResultVo error(int code, String msg) {
		ResultVo r = new ResultVo();
		r.setCode(code);
		r.setMsg(msg);
		return r;
	}

	public static ResultVo ok(String msg) {
		ResultVo r = new ResultVo();
		r.setMsg(msg);
		return r;
	}

	public ResultVo ok(T data) {
		ResultVo r = new ResultVo();
		r.setData(data);
		return r;
	}

	public static ResultVo ok() {
		return new ResultVo();
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public T getData() {
		return data;
	}

	public ResultVo setData(T data) {
		this.data = data;
        return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}