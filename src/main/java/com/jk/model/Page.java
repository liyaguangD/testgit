/** 
 * <pre>项目名称:spring--boot 
 * 文件名称:Page.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月12日下午6:54:58 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/** 
 * <pre>项目名称：spring--boot    
 * 类名称：Page    
 * 类描述：    
 * 创建人：李亚光 cht_java@126.com    
 * 创建时间：2018年11月12日 下午6:54:58    
 * 修改人：李亚光 cht_java@126.com  
 * 修改时间：2018年11月12日 下午6:54:58    
 * 修改备注：       
 * @version </pre>    
 */
public class Page {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Transient
	private Integer page=1;
	@Transient
	private Integer rows=2;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	
	
}
