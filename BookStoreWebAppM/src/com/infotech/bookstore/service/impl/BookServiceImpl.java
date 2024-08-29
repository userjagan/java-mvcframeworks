package com.infotech.bookstore.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.infotech.bookstore.dao.impl.BookDAOImpl;
import com.infotech.bookstore.model.Book;
import com.infotech.bookstore.service.BookService;

public class BookServiceImpl implements BookService {

	@Override
	public boolean createBook(Book book) throws SQLException {
		return new BookDAOImpl().insertBook(book);
	}
	
	@Override
	public List<Book> getAllBooksInfo() throws SQLException {
		return new BookDAOImpl().listAllBooks();
	}

	@Override
	public Book getBookById(int id) throws SQLException  {
		return new BookDAOImpl().getBook(id);
	}

	@Override
	public boolean deleteBookInfo(Book book) throws SQLException {
		return new BookDAOImpl().deleteBook(book);
		
	}

	@Override
	public boolean updateBookInfo(Book book) throws SQLException {
		return new BookDAOImpl().updateBook(book);
		
	}

}
