package cn.note.dao;

import java.util.List;
import java.util.Map;

import cn.note.entity.User;

/**
 * 
 * 接口名称：用户信息抓取
 * 功          能：抓取用户信息
 * 作          者：paperElephant
 * 创建时间：2017-10-08
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-08
 * 版本号：v1.0
 *
 */
public interface UserDao {
	List<User> findAll();  //查询全部用户信息
	User findUserByName(String name);  //通过用户名查询用户信息
	User findUserById(String userId);  //根据用户ID查询用户信息
	List<User> findUserByIdAndName(Map<String,String> map);  //根据ID和用户名查询用户信息
	List<User> findUserByIdOrName(Map<String,String> map);   //根据ID或用户名查询用户信息
	int addUser(User u);    //新增用户
	int deleteByName(String name);  //删除用户
	
}
