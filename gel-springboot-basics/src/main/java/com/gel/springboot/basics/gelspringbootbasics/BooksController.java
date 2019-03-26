package com.gel.springboot.basics.gelspringbootbasics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
		@GetMapping("/books")
		public List<Books> getAllBooks() {
			return Arrays.asList(new Books(1, "Mastering Spring 2.0", "Gel D"));
		}
	
}
