package cn.note.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.note.service.NoteBookNoteFoundException;
import cn.note.service.NoteBookService;
import cn.note.service.UserNotFoundException;
import cn.note.util.JsonResult;

@Controller
@RequestMapping("notebook")
public class NoteBookController extends AbstractController {
	@Resource
	private NoteBookService nbs;
	
	@ResponseBody
	@RequestMapping("list.do")
	public JsonResult list(String userId) {
		return new JsonResult(nbs.findNoteBookByUserId(userId));
	}
	
	@ResponseBody
	@ExceptionHandler(NoteBookNoteFoundException.class)
	public JsonResult noteBookExp(NoteBookNoteFoundException e) {
		e.printStackTrace();
		return new JsonResult(e);
	}
	
	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	public JsonResult userExp(UserNotFoundException e) {
		e.printStackTrace();
		return new JsonResult(e);
	}
}
