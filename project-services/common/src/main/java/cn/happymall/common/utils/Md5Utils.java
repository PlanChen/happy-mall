package cn.happymall.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {
	
	/**
	 * 私有构造函数，不允许本类生成实例 
	 */
	private Md5Utils(){
		
	}
	
	private static final String sv = "0plo98ikmju76yhnbgt54rfvcde32wsxzaq1";

	/**
	 * 用MD5算法进行加密
	 * @param pStrPW
	 * @return
	 */
	public static String crypt(String pStrPW) {
		String strCrypt = hash(pStrPW);
		if(strCrypt.length() > 0) {
			strCrypt += sv;
			strCrypt = hash(strCrypt);
		}
		
		return strCrypt;
	}
	/**
	 * 用MD5算法进行加密(16位)
	 * @param strPW
	 * @return
	 */
	public static String encryptMD5(String strPW) {
		String strCrypt = hash(strPW);
		if(strCrypt.length() > 0) {
			strCrypt += sv;
			strCrypt = hash(strCrypt);
		}
		
		return strCrypt.substring(8,24);
	}
	
	
	/**
	 * MD5算法进行散列
	 * @param str
	 * @return
	 */
	public static String hash(String str) {
		String result = "";
		if (str == null || str.equals("")) { // 如果传入参数为空，则返回空字符串
			return result;
		}
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] data = str.getBytes();
			int l = data.length;
			for (int i = 0; i < l; i++)
				md.update(data[i]);
			byte[] digest = md.digest();
			
			result = ByteUtils.byteArrayToHexString(digest);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e.getMessage(),e);
		}

		return result;		
	}

	/**
	 * @Description 获取MD5字符串 32位
	 *              Add by wangdr at 2011-11-25 11:20
	 *
	 * @param String plainText 加密前的明文字符串
	 * @return String 加密后的MD5字符串
	 */
	public static String getMd5(String plainText) {
		StringBuffer buf = new StringBuffer("");
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			try {
				md.update(plainText.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			byte b[] = md.digest();

			int i;
			for (byte element : b) {
				i = element;
				if (i < 0) {
					i += 256;
				}
				if (i < 16) {
					buf.append("0");
				}
				buf.append(Integer.toHexString(i));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return buf.toString();
	}

	public static void main(String args[]) {
		String pwd = "123456";
		if (args != null && args.length > 0) {
			pwd = args[0];
		}
		
		try {
//			System.out.println(Md5Utils.hash(pwd));
//			System.out.println(Md5Utils.crypt(pwd));
			System.out.println(Md5Utils.getMd5(pwd));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
