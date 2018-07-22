package io.br.neko.dao;

import io.br.neko.demain.BookPager;

import java.awt.print.Book;
import java.util.List;

public interface AdminBookDao {

	public List getAllBooks();

	public boolean addBook(Book book);

	public boolean checkBookNameIsExist(String bookName);

	public boolean checkISBNIsExist(String ISBN);

	public BookPager searchBook(String bookName);

	public List getAllBookName();

	public BookPager getBookPager(int index, int pageSize);

	public boolean deleteBook(int[] bookIds);
}
