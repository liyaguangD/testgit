/** 
 * <pre>项目名称:spring--boot 
 * 文件名称:Book.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月12日下午5:15:58 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * <pre>项目名称：spring--boot    
 * 类名称：Book    
 * 类描述：    
 * 创建人：李亚光 cht_java@126.com    
 * 创建时间：2018年11月12日 下午5:15:58    
 * 修改人：李亚光 cht_java@126.com  
 * 修改时间：2018年11月12日 下午5:15:58    
 * 修改备注：       
 * @version </pre>    
 */
@Document(collection="book")
public class Book implements Serializable{

	private static final long serialVersionUID = 8628600219378746203L;
	private Integer bookId;
	private String bookName;
	private Integer bookType;
	private Integer bookNumber;

	private String photo;
	
	
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookType() {
		return bookType;
	}
	public void setBookType(Integer bookType) {
		this.bookType = bookType;
	}
	public Integer getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(Integer bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	
	
	
}
