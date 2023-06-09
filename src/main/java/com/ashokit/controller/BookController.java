package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.entity.Book;
import com.ashokit.service.BookService;

@Controller
public class BookController {

	@Autowired
	public BookService bookService;
	
	
	@GetMapping("/book")
	public  String loadForm(Model model) {
		model.addAttribute("book",new Book());
		return "index";

	}
	@PostMapping("/saveBook")
	public String saveBook(Book book,Model model) {
		boolean status= bookService.saveBook(book);

		if (status) {
			model.addAttribute("Success","BOOK SAVED SUCCESSFULY");

		}
		else{
			model.addAttribute("Failure","BOOK ARE NOT SAVED");
		}

		return "index";
	}
	@GetMapping("/viewBooks")
	public String viewBooks(Model model) {
		List<Book> allBooks=bookService.getAllBooks();
		model.addAttribute("books",allBooks);
		return "index";
		
	}
}