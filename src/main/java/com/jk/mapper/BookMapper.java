/** 
 * <pre>项目名称:spring--boot 
 * 文件名称:BookMapper.java 
 * 包名:com.jk.mapper 
 * 创建日期:2018年11月12日下午7:02:20 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jk.model.Book;
import com.jk.util.MyMapper;

/** 
 * <pre>项目名称：spring--boot    
 * 类名称：BookMapper    
 * 类描述：    
 * 创建人：李亚光 cht_java@126.com    
 * 创建时间：2018年11月12日 下午7:02:20    
 * 修改人：李亚光 cht_java@126.com  
 * 修改时间：2018年11月12日 下午7:02:20    
 * 修改备注：       
 * @version </pre>    
 */
@Mapper
public interface BookMapper {

	/** <pre>getAll(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午7:28:35    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午7:28:35    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@ResultType(com.jk.model.Book.class)
	@Select("select * from t_book")
	List<Book> getAll();

	/** <pre>savebook(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午9:18:43    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午9:18:43    
	 * 修改备注： 
	 * @param book</pre>    
	 */
	
	@Insert("insert into t_book(bookId,bookName,bookType,bookNumber) values(#{c.bookId},#{c.bookName},#{c.bookType},#{c.bookNumber})")
	void savebook(@Param("c")Book book);

	/** <pre>deleteBookById(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午10:39:30    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午10:39:30    
	 * 修改备注： 
	 * @param bookId</pre>    
	 */
	@Delete("delete from t_book where bookId=#{bookId}")
	void deleteBookById(Integer bookId);

	/** <pre>getid(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午11:17:08    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午11:17:08    
	 * 修改备注： 
	 * @param bookId
	 * @return</pre>    
	 */
	@ResultType(com.jk.model.Book.class)
	@Select("select * from t_book where bookId=#{bookId}")
	Book getid(Integer bookId);

	/** <pre>updateBook(这里用一句话描述这个方法的作用)   
	 * 创建人：李亚光 cht_java@126.com     
	 * 创建时间：2018年11月12日 下午11:36:09    
	 * 修改人：李亚光 cht_java@126.com      
	 * 修改时间：2018年11月12日 下午11:36:09    
	 * 修改备注： 
	 * @param book</pre>    
	 */
	@Update("update t_book set bookName=#{book.bookName},bookType=#{book.bookType},bookNumber=#{book.bookNumber} where bookId=#{book.bookId}")
	void updateBook(@Param("book")Book book);


}
