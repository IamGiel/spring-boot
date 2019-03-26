package com.in28minutes.springboots.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
		@GetMapping("/books")
		public List<Books> getAllBooks() {
			return Arrays.asList(new Books(1, "Mastering Spring", "Gel D"));
		}
	
}
