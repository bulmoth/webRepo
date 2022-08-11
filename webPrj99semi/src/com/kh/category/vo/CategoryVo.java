package com.kh.category.vo;

public class CategoryVo {
	
	private String categoryNo;
	private String categoryName;
	
	public CategoryVo() {
		
	}

	public CategoryVo(String categoryNo, String categoryName) {
		super();
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryVo [categoryNo=" + categoryNo + ", categoryName=" + categoryName + "]";
	}
	
}
