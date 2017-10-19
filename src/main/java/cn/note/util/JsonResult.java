package cn.note.util;

import java.io.Serializable;


/**
 * 
 * 工具类名称：Json结果信息类
 * 功          能：Json信息调用
 * 作          者：paperElephant
 * 创建时间：2017-10-10
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-10
 * 版本号：v1.0
 *
 */
public class JsonResult implements Serializable {

	/**
	 * json结果信息类:v1.0
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int SUCCESS = 0;  //返回状态成功
	public static final int ERROR = 1;    //返回状态失败
	private int state;   //状态
	private Object data;  //返回数据
	private String message;  //返回信息
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JsonResult() {
		super();
	}
	public JsonResult(int state,String message) {
		super();
		this.state = state;
		this.message = message;
		this.data = null;
	}
	public JsonResult(int state,Throwable e) {
		super();
		this.state = state;
		this.message = e.getMessage();
		this.data = null;
	}
	public JsonResult(int state,Object data) {
		super();
		this.state = state;
		this.data = data;
		this.message = "";
	}
	public JsonResult(Object data) {
		super();
		this.state = SUCCESS;
		this.data = data;
		this.message = "";
	}
	public JsonResult(Throwable e) {
		this.state = ERROR;
		this.message = e.getMessage();
		this.data = null;
	}

}
