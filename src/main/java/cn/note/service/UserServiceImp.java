package cn.note.service;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.note.dao.UserDao;
import cn.note.entity.User;
import cn.note.util.Action;
import cn.note.util.Md5Pwd;

@Service("userService")
public class UserServiceImp implements UserService {
	
	@Resource
	private UserDao ud;
	
	//登录功能
	
	public User login(String name, String password) throws NameException, PasswordException {
		if(name == null || name.trim().equals("")) {
			throw new NameException("用户名不能为空");
		}
		if(password == null || password.trim().equals("")) {
			throw new PasswordException("密码不能为空");
		}
		User u = ud.findUserByName(name);
		if(u == null) {
			throw new UserNotFoundException("用户不存在");
		}
		if(!Md5Pwd.EncrPwd(password).equals(u.getPassword())) {
			throw new PasswordException("密码错误");
		}
		return u;
	}
	
	//根据用户名查找用户信息
	public User findUserByName(String name) throws UserNotFoundException {
		if(name==null || name.trim().equals("")) {
			throw new UserNotFoundException("用户名不能为空");
		}
		User u = ud.findUserByName(name);
		if(u==null) {
			throw new UserNotFoundException("用户不存在");
		}
		return u;
	}
	
	//根据用户ID查找用户信息
	public User findUserById(String userId) throws UserNotFoundException {
		if(userId==null || userId.trim().equals("")) {
			throw new UserNotFoundException("用户ID不能为空");
		}
		User u = ud.findUserById(userId);
		if(u == null) {
			throw new UserNotFoundException("用户不存在");
		}
		return u;
	}
	
	//用户注册
	public User register (String name,String password,String conf,String nick) {
		if(name == null || name.trim().equals("")) {
			throw new NameException("用户名不能为空");
		}
		if(password == null ||password.trim().equals("")) {
			throw new PasswordException("密码不能为空");
		}
		if(conf == null || conf.trim().equals("")) {
			throw new PasswordException("密码确认不能为空");
		}
		User u = ud.findUserByName(name);
		if(u != null) {
			throw new NameException("用户名已存在");
		} 
		if(!password.equals(conf)) {
			throw new PasswordException("密码确认与密码不一致");
		}else{
			User user = new User();
			user.setUserId(UUID.randomUUID().toString());
			user.setName(name);
			user.setNick(nick);
			user.setPassword(Md5Pwd.EncrPwd(password));
			ud.addUser(user);
			return user;
		}
	}
	
	
	

}





