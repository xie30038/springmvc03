package cn.note.entity;

import java.io.Serializable;
/**
 * 
 * 实体类名称：笔记本信息
 * 功          能：存储笔记本信息类
 * 作          者：paperElephant
 * 创建时间：2017-10-05
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-05
 * 版本号：v1.0
 *
 */
public class NoteBook implements Serializable {

	/**
	 * 笔记本信息类，1.0版本
	 */
	private static final long serialVersionUID = 1L;
	private String noteBookId;  //笔记本ID
	private String userId;      //用户名称
	private String typeId;      //笔记本类型
	private String noteBookName;//笔记本名称
	private String desc;        //
	private Long createTime;  //创建时间
	public String getNoteBookId() {
		return noteBookId;
	}
	public void setNoteBookId(String noteBookId) {
		this.noteBookId = noteBookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getNoteBookName() {
		return noteBookName;
	}
	public void setNoteBookName(String noteBookName) {
		this.noteBookName = noteBookName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public NoteBook() {
		super();
	}
	public NoteBook(String noteBookId, String userId, String typeId, String noteBookName, String desc,
			Long createTime) {
		super();
		this.noteBookId = noteBookId;
		this.userId = userId;
		this.typeId = typeId;
		this.noteBookName = noteBookName;
		this.desc = desc;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "NoteBook [noteBookId=" + noteBookId + ", userId=" + userId + ", typeId=" + typeId + ", noteBookName="
				+ noteBookName + ", desc=" + desc + ", createTime=" + createTime + "]";
	}
	
	
}
