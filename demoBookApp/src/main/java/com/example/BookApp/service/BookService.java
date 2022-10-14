package com.example.BookApp.service;

import java.util.List;

import com.example.BookApp.entity.Book;

public interface BookService {

	public void createBook(Book book);
	public List<Book> getAllBooks();
	public void deleteBook(int bookId);
	void updateBook(Book book, int bookId);
	Book findByID(int bookId);
}
