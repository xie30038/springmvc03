package cn.note.service;

import java.util.List;

import cn.note.entity.Note;

/**
 * 接口信息
 * 笔记业务接口
 * @author xie30038
 *
 */
public interface NoteService {
	List<Note> findNoteByNotebookId(String notebookId) throws NoteNotFoundException;
	List<Note> findNoteByUserId(String userId) throws NoteBookNotFoundException,NoteNotFoundException,UserNotFoundException;
	List<Note> findNoteByUserName(String userName) throws NoteNotFoundException,UserNotFoundException;
	List<Note> findNoteByNotebookName(String notebookName) throws NoteNotFoundException,NoteBookNotFoundException;
}
