package cn.note.entity;

import java.io.Serializable;

/**
 * 
 * 实体类名称：笔记信息
 * 功          能：存储笔记信息类
 * 作          者：paperElephant
 * 创建时间：2017-10-08
 * 最后维护人：paperElephant
 * 最后维护时间：2017-10-08
 * 版本号：v1.0
 *
 */
public class Note implements Serializable {

	/**
	 * 笔记信息类，v1.0版本
	 */
	private static final long serialVersionUID = 1L;
	private String noteId;        //笔记ID
	private String noteBookId;    //笔记本ID
	private String userId;        //用户ID
	private String statusId;      //
	private String typeId;        //类型
	private String title;         //标题
	private String body;          //正文
	private Long createTime;      //创建时间
	private Long lastModifyTime;  //最后修改时间
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
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
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Long lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Note() {
		super();
	}
	public Note(String noteId, String noteBookId, String userId, String statusId, String typeId, String title,String body,
			Long createTime, Long lastModifyTime) {
		super();
		this.noteId = noteId;
		this.noteBookId = noteBookId;
		this.userId = userId;
		this.statusId = statusId;
		this.typeId = typeId;
		this.title = title;
		this.body = body;
		this.createTime = createTime;
		this.lastModifyTime = lastModifyTime;
	}
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteBookId=" + noteBookId + ", userId=" + userId + ", statusId=" + statusId
				+ ", typeId=" + typeId + ", title=" + title + ", body="+ body +", createTime=" + createTime + ", lastModifyTime="
				+ lastModifyTime + "]";
	}
	
	
}
