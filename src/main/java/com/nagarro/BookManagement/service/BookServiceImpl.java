package com.nagarro.BookManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.BookManagement.dao.BookDao;
import com.nagarro.BookManagement.model.Book;

/**
 * Service Implementation Class
 * Implements, find list of books, 
 * add book details
 * edit book details, 
 * delete book details
 * 
 * @author maibu
 *
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	//Get List of Books 
	@Override
	public List<Book> getBooks() 
	{
		return bookDao.findAll();
	}

	//Get single book by id
	@Override
	public Book getBook(int bookcode) 
	{
		return bookDao.getById(bookcode);
	}

	//Add a book to the list of books
	@Override
	public Book addBook(Book book) 
	{
		bookDao.save(book);
		return book;
	}

	//Edit the book details
	@Override
	public Book updateBook(Book book) 
	{
		bookDao.save(book);
		return book;
	}

	//Delete the book
	@Override
	public void deleteBook(int parseInt) 
	{
		Book entity = bookDao.getById(parseInt);
		bookDao.delete(entity);
	}

}
