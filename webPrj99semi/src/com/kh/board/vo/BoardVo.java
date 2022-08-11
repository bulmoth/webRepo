package com.kh.board.vo;

public class BoardVo {
	
	private String no;
	private String type;
	private String categoryNo;	//작성기능 : 카테고리 번호 | 조회기능 : 카테고리 이름
	private String title;
	private String content;
	private String writer;		//작성기능 : 회원 번호 | 조회기능 : 회원 이름
	private String cnt;
	private String enrollDate;
	private String status;
	
	public BoardVo() {
		
	}

	public BoardVo(String no, String type, String categoryNo, String title, String content, String writer, String cnt,
			String enrollDate, String status) {
		super();
		this.no = no;
		this.type = type;
		this.categoryNo = categoryNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.cnt = cnt;
		this.enrollDate = enrollDate;
		this.status = status;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", type=" + type + ", categoryNo=" + categoryNo + ", title=" + title + ", content="
				+ content + ", writer=" + writer + ", cnt=" + cnt + ", enrollDate=" + enrollDate + ", status=" + status
				+ "]";
	}
	
	

}
