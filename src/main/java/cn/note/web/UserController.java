package cn.note.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.note.service.NameException;
import cn.note.service.PasswordException;
import cn.note.service.UserNotFoundException;
import cn.note.service.UserService;
import cn.note.util.ExceptionState;
import cn.note.util.JsonResult;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService us;
	
	//用户名称检验
	@ResponseBody
	@RequestMapping("verifyname.do")
	public JsonResult VerUseerName(String name) {
		return new JsonResult(us.findUserByName(name));
	}
	
	//用户注册
	@ResponseBody
	@RequestMapping("register.do")
	public JsonResult register(String name,String password,String conf,String nick) {
		return new JsonResult(us.register(name, password, conf, nick));
	}
	
	//用户登录
	@ResponseBody
	@RequestMapping("login.do")
	public JsonResult login(String name,String password) {
		return new JsonResult(us.login(name, password));
	}
	
	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	public JsonResult userExp(UserNotFoundException e) {
		e.printStackTrace();
		ExceptionState expState = new ExceptionState(e);
		return new JsonResult(expState.getExceptionState(), e);
	}
	
	@ResponseBody
	@ExceptionHandler(NameException.class)
	public JsonResult nameExp(NameException e) {
		e.printStackTrace();
		ExceptionState expState = new ExceptionState(e);
		return new JsonResult(expState.getExceptionState(), e);
	}
	
	@ResponseBody
	@ExceptionHandler(PasswordException.class)
	public JsonResult pwdExp(PasswordException e) {
		e.printStackTrace();
		ExceptionState expState = new ExceptionState(e);
		return new JsonResult(expState.getExceptionState(), e);
	}
	
	
	
	

}
