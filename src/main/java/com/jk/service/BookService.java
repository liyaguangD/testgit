/** 
 * <pre>项目名称:spring--boot 
 * 文件名称:BookService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年11月12日下午5:13:32 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.mapper.BookMapper;
import com.jk.model.Book;

import redis.clients.jedis.ShardedJedisPool;


/** 
 * <pre>项目名称：spring--boot    
 * 类名称：BookService    
 * 类描述：    
 * 创建人：李亚光 cht_java@126.com    
 * 创建时间：2018年11月12日 下午5:13:32    
 * 修改人：李亚光 cht_java@126.com  
 * 修改时间：2018年11月12日 下午5:13:32    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class BookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	

	/** <pre>getAll(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午7:28:13    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午7:28:13    
	 * 修改备注： 
	 * @return</pre>    
	 */
	public List<Book> getAll() {
		
		return bookMapper.getAll();
	}

	/** <pre>savebook(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午10:23:20    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午10:23:20    
	 * 修改备注： 
	 * @param book</pre>    
	 */
	public void savebook(Book book) {
		Map<String, String> map = new HashMap<>();
		if (book.getBookId()!=null) {
			bookMapper.updateBook(book);
		}else{
			bookMapper.savebook(book);
		}
	}

	/** <pre>deleteBookById(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午10:39:11    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午10:39:11    
	 * 修改备注： 
	 * @param bookId</pre>    
	 */
	public void deleteBookById(Integer bookId) {
		bookMapper.deleteBookById(bookId);
	}

	/** <pre>getid(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午11:15:59    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午11:15:59    
	 * 修改备注： 
	 * @param bookId
	 * @return</pre>    
	 */
	public Book getid(Integer bookId) {
		
		return bookMapper.getid(bookId);
	}





}
