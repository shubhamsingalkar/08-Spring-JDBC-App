package com.book.service;

import javax.sql.DataSource;

import com.book.dao.BookDao;

public class BookServiceImpl implements BookService {

	
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}


	@Override
	public boolean saveBook() {
	
		
		boolean status = bookDao.save();
		
		if(status) {
			System.out.println("Record is inserted....");
			
		}else {
			System.out.println("Insertion failed....");
		}
		return status;
	}

}
