package com.nagarro.BookManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.BookManagement.model.Book;
import com.nagarro.BookManagement.service.BookService;

/**
 * 
 * Controller Class 
 * @author maibu
 *
 */
@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}

	//get the books
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.bookService.getBooks();
	}
	
	//get single book
	@GetMapping("/books/{bookcode}")
	public Book getBook(@PathVariable String bookcode) 
	{
		return this.bookService.getBook(Integer.parseInt(bookcode));
	}
	
	//Add Book details
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) 
	{
		return this.bookService.addBook(book);
	}
	
	//Update or Edit the book details
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) 
	{
		return this.bookService.updateBook(book);
	}
	
	//Delete the book 
	@DeleteMapping("/books/{bookcode}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable String bookcode)
	{
		try {
			this.bookService.deleteBook(Integer.parseInt(bookcode));
			return new ResponseEntity<>(HttpStatus.OK);				
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
