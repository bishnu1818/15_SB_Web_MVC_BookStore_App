package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Book;
import com.ashokit.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookrepo;
	@Override
	public boolean saveBook(Book book) {
		Book save = bookrepo.save(book);
		if(save.getBookId()!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

}
