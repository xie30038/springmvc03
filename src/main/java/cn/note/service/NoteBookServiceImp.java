package cn.note.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.note.dao.NoteBookDao;
import cn.note.dao.UserDao;
import cn.note.entity.NoteBook;

/**
 * 
 * 业务类名称：笔记本业务类
 * 功          能：笔记本业务信息
 * 作          者：paperElephant
 * 创建时间：2017-10-12
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-12
 * 版本号：v1.0
 *
 */

@Service("noteBookService")
public class NoteBookServiceImp implements NoteBookService {
	
	@Resource
	private UserDao ud;
	@Resource
	private NoteBookDao nbd;
	
	//通过用户ID查找笔记本
	public List<NoteBook> findNoteBookByUserId(String userId) throws NoteBookNoteFoundException {
		if(userId == null || userId.trim().equals("")) {
			throw new UserNotFoundException("用户Id不能为空");
		}
		if(ud.findUserById(userId) == null) {
			throw new NoteBookNoteFoundException("用户不存在");
		}
		return nbd.findNoteBookByUserId(userId);
	}

}
