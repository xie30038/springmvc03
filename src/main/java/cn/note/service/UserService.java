package cn.note.service;

import org.springframework.stereotype.Service;

import cn.note.entity.User;


/**
 * 
 * 接口名称：用户业务接口
 * 功          能：用户业务
 * 作          者：paperElephant
 * 创建时间：2017-10-12
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-12
 * 版本号：v1.0
 *
 */

@Service("userService")
public interface UserService {
	User login(String name,String password) throws NameException,PasswordException;
	User findUserByName(String name) throws UserNotFoundException;
	User findUserById(String userId) throws UserNotFoundException;
}
