package cn.note.entity;

import java.io.Serializable;
/**
 * 
 * 实体类名称：用户信息
 * 功          能：存储用户信息类
 * 作          者：paperElephant
 * 创建时间：2017-10-05
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-05
 * 版本号：v1.0
 *
 */
public class User implements Serializable {

	/**
	 * 用户实体类，1.0版本
	 */
	private static final long serialVersionUID = (long) 1.0;
	
	private String userId;  //用户ID
	private String userName;    //用户名
	private String password;//密码
	private String token;   //会话标志
	private String nick;    // 昵称
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return userName;
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public User(String userId, String userName, String password, String token, String nick) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.token = token;
		this.nick = nick;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", token=" + token + ", nick="
				+ nick + "]";
	}
	
}
