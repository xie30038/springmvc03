package cn.note.dao;

import java.util.List;

import cn.note.entity.NoteBook;

/**
 * 
 * 接口名称：笔记本信息抓取
 * 功          能：抓取笔记本信息
 * 作          者：paperElephant
 * 创建时间：2017-10-08
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-08
 * 版本号：v1.0
 *
 */
public interface NoteBookDao {
	List<NoteBook> findAllNoteBook();    //查询全部笔记本信息
	NoteBook findNoteBookByNotebookId(String noteBookId);   //根据笔记本ID查询笔记本
	List<NoteBook> findNoteBookByUserId(String userId);   //根据用户名查询笔记本信息
}
