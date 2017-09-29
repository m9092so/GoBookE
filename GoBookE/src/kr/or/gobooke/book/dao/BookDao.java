package kr.or.gobooke.book.dao;

import java.sql.ResultSet;
import java.util.List;

import kr.or.gobooke.book.domain.Book;

/**
 * 책 데이터 베이스 처리 인터페이스
 * 
 * @author Park Joo-Yeon
 *
 */
public interface BookDao {
	/** 도서 등록 */
	public void create(Book book);
	
	/** 도서 수정 */
	public void update(Book book);
	
	/** 도서 검색 - 관리자 */
	public List<Book> search(String filter, String content);
	
	/** BOOK 객체 생성*/
	public Book createBook(ResultSet set);
	
}
