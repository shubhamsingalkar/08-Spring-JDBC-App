package com.book.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.service.BookService;

public class TestBook {

	public static void main(String[] args) {
		
		
	ApplicationContext ctxt	= new ClassPathXmlApplicationContext("bean-book.xml");
	
	BookService bookservice = ctxt.getBean(BookService.class);
	
	bookservice.saveBook();

	}

}
