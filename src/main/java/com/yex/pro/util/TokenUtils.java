package com.yex.pro.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public final class TokenUtils {
	
	/**
	 * base64加密
	 * @param str
	 * 待编码字符串
	 * @return
	 * 加密后的64位字符串
	 */
	public static String encode(String str) {
		try {
			String result = Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("tokenUtils 加密失败");
		}
	}
	
	/**
	 * base64解密
	 * @param str
	 * 待解密参数
	 * @return
	 * 解密后的字符串 UUID-IP
	 */
	public static String decode(String str) {
		byte[] asBytes = Base64.getDecoder().decode(str);
		try {
			String result = new String(asBytes,"UTF-8");
			return result;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException("tokenUtils 解密失败");
		}
	}

}
