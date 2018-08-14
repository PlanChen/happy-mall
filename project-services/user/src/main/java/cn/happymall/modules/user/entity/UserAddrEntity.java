package cn.happymall.modules.user.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 收货地址表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
@TableName("tb_user_addr")
public class UserAddrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 地址ID
	 */
	@TableId
	private String addrId;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 收货人全名
	 */
	private String receiverName;
	/**
	 * 固定电话
	 */
	private String receiverPhone;
	/**
	 * 移动电话
	 */
	private String receiverMobile;
	/**
	 * 省份
	 */
	private String receiverState;
	/**
	 * 城市
	 */
	private String receiverCity;
	/**
	 * 区/县
	 */
	private String receiverDistrict;
	/**
	 * 收货地址，如：xx路xx号
	 */
	private String receiverAddress;
	/**
	 * 邮政编码,如：110000
	 */
	private String receiverZip;
	/**
	 * 
	 */
	private Date created;
	/**
	 * 
	 */
	private Date updated;

	/**
	 * 设置：地址ID
	 */
	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}
	/**
	 * 获取：地址ID
	 */
	public String getAddrId() {
		return addrId;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：收货人全名
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
	 * 获取：收货人全名
	 */
	public String getReceiverName() {
		return receiverName;
	}
	/**
	 * 设置：固定电话
	 */
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	/**
	 * 获取：固定电话
	 */
	public String getReceiverPhone() {
		return receiverPhone;
	}
	/**
	 * 设置：移动电话
	 */
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	/**
	 * 获取：移动电话
	 */
	public String getReceiverMobile() {
		return receiverMobile;
	}
	/**
	 * 设置：省份
	 */
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	/**
	 * 获取：省份
	 */
	public String getReceiverState() {
		return receiverState;
	}
	/**
	 * 设置：城市
	 */
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	/**
	 * 获取：城市
	 */
	public String getReceiverCity() {
		return receiverCity;
	}
	/**
	 * 设置：区/县
	 */
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	/**
	 * 获取：区/县
	 */
	public String getReceiverDistrict() {
		return receiverDistrict;
	}
	/**
	 * 设置：收货地址，如：xx路xx号
	 */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	/**
	 * 获取：收货地址，如：xx路xx号
	 */
	public String getReceiverAddress() {
		return receiverAddress;
	}
	/**
	 * 设置：邮政编码,如：110000
	 */
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}
	/**
	 * 获取：邮政编码,如：110000
	 */
	public String getReceiverZip() {
		return receiverZip;
	}
	/**
	 * 设置：
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * 获取：
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * 设置：
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/**
	 * 获取：
	 */
	public Date getUpdated() {
		return updated;
	}
}
