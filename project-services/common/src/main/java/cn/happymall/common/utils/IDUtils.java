package cn.happymall.common.utils;

import java.util.Random;
import java.util.UUID;
/**
 * id生成工具
 * @author Administrator
 *
 */
public class IDUtils {

	/**
	 * 生成UUID
	 * @return
	 */
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		uuid = uuid.toUpperCase();
		return uuid;
	}
	
	/**
	 * 生成优惠券号
	 * @return
	 */
	public static String getCouponNo(){
		Random r = new Random();
		Long time = System.currentTimeMillis();
		int max=1000;
		int min=100;
		Integer rInt = r.nextInt(max)%(max-min+1) + min;
		String couponNo = time.toString()+rInt;
		return couponNo;
	}
	
	/**
	 * 生成订单号
	 * @return
	 */
	public static String getOrderNo(){
		Random r = new Random();
		Long time = System.currentTimeMillis();
		int max=100000;
		int min=10000;
		Integer rInt = r.nextInt(max)%(max-min+1) + min;
		String couponNo ="DD"+time.toString()+rInt;
		return couponNo;
	}
	
	/**
	 * 生成订单号
	 * @return
	 */
	public static String getRefundNo(){
		Random r = new Random();
		Long time = System.currentTimeMillis();
		int max=100000;
		int min=10000;
		Integer rInt = r.nextInt(max)%(max-min+1) + min;
		String couponNo = "TH"+time.toString()+rInt;
		return couponNo;
	}

	public static void main(String[] args) {
		System.out.println(getCouponNo());
	}
	
}
