package com.example.BookApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookApp.entity.Book;
import com.example.BookApp.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void createBook(Book book) {
		bookRepository.save(book);
	}
	
	@Override
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);
	}
	
	@Override
	public Book findByID(int bookId) {
		Optional<Book> findById = bookRepository.findById(bookId);
		if(findById.isPresent()) {
			return findById.get();
		}
		else {
			System.out.println("id not exist in db");
		}
		return null;
	}
	
	@Override
	public void updateBook(Book book,int bookId) {
	
		Optional<Book> findById = bookRepository.findById(bookId);
		if(findById.isPresent()) {
			Book bookData = findById.get();
			book.setBookTitle(bookData.getBookTitle());
			book.setIsbn(bookData.getIsbn());
			book.setBookFileName(bookData.getBookFileName());
			book.setBorrowDuration(bookData.getBorrowDuration());
			book.setBorrowPrice(bookData.getBorrowPrice());
			bookRepository.save(book);
		}{
			System.out.println("No data exist for that id:" +bookId);
		}
		
	}

}
