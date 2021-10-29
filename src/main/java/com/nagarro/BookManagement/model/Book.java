package com.nagarro.BookManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Book Entity Class
 * Mapping book details to the database
 * 
 * @author maibu
 *
 */
@Entity
@Table(name = "book_tb")
public class Book {

//	private Integer id;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer bookcode;
	@Column
	private String bookname;
	@Column
	private String author;
	@Column
	private String date;
	
	//Getters and Setters
	public Integer getBookcode() {
		return bookcode;
	}
	public void setBookcode(Integer bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", author=" + author + ", date=" + date + "]";
	}
	
	//Parameterized Constructor 
	public Book(Integer bookcode, String bookname, String author, String date) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.author = author;
		this.date = date;
	}
	
	//Constructor from super class
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
