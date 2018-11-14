/** 
 * <pre>项目名称:spring--boot 
 * 文件名称:BookController.java 
 * 包名:com.jk.controller 
 * 创建日期:2018年11月12日下午5:13:04 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jk.model.Book;
import com.jk.service.BookService;

import redis.clients.jedis.ShardedJedisPool;

/** 
 * <pre>项目名称：spring--boot    
 * 类名称：BookController    
 * 类描述：    
 * 创建人：李亚光 cht_java@126.com    
 * 创建时间：2018年11月12日 下午5:13:04    
 * 修改人：李亚光 cht_java@126.com  
 * 修改时间：2018年11月12日 下午5:13:04    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	

	@Autowired
	private MongoTemplate mongoTemplate;
	
/*	@Autowired
	RedisTemplate<String, Object> redisTemplate;*/
    @RequestMapping("/getAll")
    public String getAll(Book book,Model model) {
    	List<Book> list = bookService.getAll();
    	
    	System.out.println(1);
    	model.addAttribute("list", list);
   
        return "book";
        
    }
    @RequestMapping("addbook")
    public String addbook(){
    	return "addbook";
    }
    @RequestMapping(value="/savebook",method = RequestMethod.POST)
    public String  savebook(Book book){
    	
    	String msg = book.getBookId() == null ? "新增成功!" : "更新成功!";
    	bookService.savebook(book);
    	
    	mongoTemplate.insert(book);
		return "redirect:/book/getAll";
    }
    @RequestMapping(value="/deletebookById/{bookId}")
    public String deleteBookById(@PathVariable Integer bookId){
    	bookService.deleteBookById(bookId);
    	return "redirect:/book/getAll";
    }
    @RequestMapping(value = "/books/{bookId}")
    public String view(@PathVariable Integer bookId,Model model) {
        Book book = bookService.getid(bookId);
        model.addAttribute("book", book);
        return "updatebook";
    }
    
}
