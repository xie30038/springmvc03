package cn.note.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.note.util.JsonResult;

public abstract class AbstractController {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object exp(Exception e) {
		e.printStackTrace();
		return new JsonResult(e);
	}
}
