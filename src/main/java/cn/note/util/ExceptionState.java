package cn.note.util;

import java.io.Serializable;

public class ExceptionState implements Serializable {

	/**
	 * 异常状态类：v1.0
	 */
	private static final long serialVersionUID = 1L;
	
	//private int expState;     //异常状态
	private Exception e;      //异常类
	public ExceptionState() {
		super();
	}
	public ExceptionState(Exception e) {
		this.e = e;
	}
	
	//获取异常状态方法
	public int getExceptionState() {
		if(e == null) {
			return 0;
		}
		String str = e.getMessage();
		if(str == null || str.trim().equals("")) {
			return 1;
		}else if(str.equals("用户不存在")) {
			return 2;
		}else if(str.equals("用户名不能为空")) {
			return 3;
		}else if(str.equals("用户名不存在")) {
			return 4;
		}else if(str.equals("用户名已存在")) {
			return 5;
		}else if(str.equals("密码不能为空")) {
			return 6;
		}else if(str.equals("密码确认与密码不一致")) {
			return 7;
		}else if(str.equals("密码错误")) {
			return 8;
		}else if(str.equals("密码确认不能为空")) {
			return 9;
		}else {
			return 1;
		}
		
	}
	
	
}
