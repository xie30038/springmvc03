package cn.note.service;

import java.util.List;

import cn.note.entity.NoteBook;

/**
 * 
 * 接口名称：笔记本业务接口
 * 功          能：笔记本信息
 * 作          者：paperElephant
 * 创建时间：2017-10-11
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-11
 * 版本号：v1.0
 *
 */
public interface NoteBookService {
	List<NoteBook> findNoteBookByUserId(String userId) throws NoteBookNotFoundException;
}
