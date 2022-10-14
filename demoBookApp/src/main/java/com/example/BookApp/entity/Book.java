package com.example.BookApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
	private int bookId;
	private String bookTitle;
	private String isbn;
	private int publisherId;
	private String bookFileName;
	private int borrowDuration;
	private Double borrowPrice;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getBookFileName() {
		return bookFileName;
	}
	public void setBookFileName(String bookFileName) {
		this.bookFileName = bookFileName;
	}
	public int getBorrowDuration() {
		return borrowDuration;
	}
	public void setBorrowDuration(int borrowDuration) {
		this.borrowDuration = borrowDuration;
	}
	public Double getBorrowPrice() {
		return borrowPrice;
	}
	public void setBorrowPrice(Double borrowPrice) {
		this.borrowPrice = borrowPrice;
	}
	
	
	
}
