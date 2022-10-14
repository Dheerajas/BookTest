package com.example.BookApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.BookApp.entity.Book;
import com.example.BookApp.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/load")
	public String book() {
		return "create_book";
	}
	
	@RequestMapping("/create")
	public String createBook(@ModelAttribute("book")Book book) {
		bookService.createBook(book);
		return "create_book";
	}
	
	@RequestMapping("/getBooks")
	public String getAllBooks(@ModelAttribute("book")Book book,ModelMap modelMap) {
		List<Book> allBooks = bookService.getAllBooks();
		modelMap.addAttribute("books", allBooks);
		return "show_books";
		
	}
	
	
	@RequestMapping("/deleteById")
	public String deleteBook(@RequestParam("bookId")int bookId,@ModelAttribute("book")Book book,ModelMap modelMap) {
		bookService.deleteBook(bookId);
		
		List<Book> allBooks = bookService.getAllBooks();
		modelMap.addAttribute("books", allBooks);
		return "show_books";
		
	}
	
	@RequestMapping("/updateById")
	public String getBookById(@RequestParam("bookId")int bookId,ModelMap modelMap) {
		Book findByID = bookService.findByID(bookId);
		modelMap.addAttribute("findByID", findByID);
		return "update_book";
		
	}
	
	@RequestMapping("/update")
	public String updateBook(@RequestParam("bookId")int bookId,@ModelAttribute("book")Book book,ModelMap modelMap) {
		bookService.updateBook(book, bookId);
		
		List<Book> allBooks = bookService.getAllBooks();
		modelMap.addAttribute("books", allBooks);
		return "show_books";	}
}
