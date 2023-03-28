package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	private static List<Book>Books = new ArrayList<Book>();
	
	@GetMapping("/getbooks")
	public List<Book>getBooks(){
		return Books;
		
	}
	
	@PostMapping("/addbooks")
	public Book addBooks(@RequestBody Book book) {
		Books.add(book);
		return book;
	}

}
