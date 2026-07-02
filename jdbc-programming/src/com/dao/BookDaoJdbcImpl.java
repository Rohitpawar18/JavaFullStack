package com.dao;

import java.util.List;
import java.util.Optional;

import com.pojo.Book;

public class BookDaoJdbcImpl implements BookDao {

	@Override
	public boolean save(Book b) {
		
		String sql = "insert into books values (?, ?, ?, ?)";
		return false;
	}

	@Override
	public Optional<Book> find(int isbn) {
		
		String sql = "select * from books where isbn = " + isbn;
		return Optional.empty();
	}

	@Override
	public List<Book> list() {
		
		String sql = "select * from books";
		return null;
	}

	@Override
	public boolean delete(int isbn) {
		
		String sql = "delete from books where isbm = " + isbn;
		return false;
	}

	@Override
	public List<Book> findByPrice(double min, double max) {
		
		String sql = "select * from books where price between ? and ?";
		return null;
	}

}
