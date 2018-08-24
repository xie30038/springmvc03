package cn.note.util;

import java.util.ArrayList;
import java.util.List;

public class Page<T> extends ArrayList<T> {
	private int pageNo = 1;    //页码，默认第一条
	private int pageSize = 5;  //每页显示条数，默认5条
	private int totalRecord;  //总条数
	private int totalPage;  //总页数
	private List<T> result;
	
	public Page() {
		
	}
	public Page(int pageNo,int pageSize,int totalRecord,List<T> result) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		this.setResult(result);
		this.totalPage = totalRecord % pageSize == 0 ? totalRecord / pageSize : totalRecord / pageSize + 1;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", pageSize=" + pageSize + ", totalRecord=" + totalRecord + ", totalPage="
				+ totalPage + ", result=" + result + "]";
	}
	
	
	
	
	
	
}
