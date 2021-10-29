package com.nagarro.BookManagement.service;

import java.util.List;
import com.nagarro.BookManagement.model.Book;


/**
 * Service Interface Class
 * @author maibu
 *
 */
public interface BookService {

	public List<Book> getBooks();
	
	public Book getBook(int bookcode);
	
	public Book addBook(Book book);
	
	public Book updateBook(Book book);

	public void deleteBook(int parseInt);
}
