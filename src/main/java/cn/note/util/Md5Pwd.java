package cn.note.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5加密处理密码
 * @author xie30038
 *
 */
public final class Md5Pwd {
	private static final String SALT = "LuoManLing";
	public static String EncrPwd(String pwd) {
		return DigestUtils.md5Hex(pwd+SALT);
	}
}
