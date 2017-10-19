package cn.note.service;


/**
 * 
 * 异常类名称：用户名异常类
 * 功          能：用户名异常信息
 * 作          者：paperElephant
 * 创建时间：2017-10-08
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-08
 * 版本号：v1.0
 *
 */
public class NameException extends RuntimeException {

	/**
	 * 用户名异常类，v1.0版本
	 */
	private static final long serialVersionUID = 1L;

	public NameException() {
		// TODO Auto-generated constructor stub
	}

	public NameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
