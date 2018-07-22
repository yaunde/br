package io.br.neko.dao;

import io.br.neko.demain.Book;

import java.util.List;


public interface RecomenderDao {
	public List getAllData();

	public int addData(int userId, long bookId, int type, float rating);

	public List<Integer> getOnclicMaxNum();

	List<String[]> getData();

	List<String[]> getData2();
	
	List<Book> getRecomenderBooks(List<Integer> bookIds);
}
