package cn.note.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.note.dao.UserDao;
import cn.note.entity.User;

@Service("userService")
public class UserServiceImp implements UserService {
	
	@Resource
	private UserDao ud;
	
	//登录功能
	public User login(String name, String password) throws NameException, PasswordException {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}
	

}
