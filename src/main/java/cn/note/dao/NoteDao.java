package cn.note.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import cn.note.entity.Note;
import cn.note.util.Page;

/**
 * 
 * 接口名称：笔记信息抓取
 * 功          能：抓取笔记信息
 * 作          者：paperElephant
 * 创建时间：2017-10-08
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-08
 * 版本号：v1.0
 *
 */
@Repository
public interface NoteDao {
	List<Note> findAllNote();       //查找所有笔记信息
	List<Note> findNoteByUserId(String userId);    //根据用户ID查找笔记本信息
	List<Note> findNoteByName(String name);    //根据用户名查找笔记信息
	List<Note> findNoteByNotebookId(String notebookId);  //根据笔记本ID查找笔记信息
	int updateNote(Note note);       //更新笔记
	int deleteNote(Note note);       //删除笔记 
	int deleteNoteByNoteId(String noteId);   //根据笔记id删除笔记
	int addNote(Note note);          //添加笔记
	//Page<Note> pageByConditions(RowBounds rowBounds, Note note);     //没用的
	//List<Note> queryNoteByPage(Map<String,Object> data);
}
