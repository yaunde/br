package io.br.neko.dao;

public interface AddToCarDao {
	/**
	 * 添加书籍到购物车
	 * @param userId
	 * @param bookId
	 * @return
	 */
	public int addBookCar(int userId, long bookId);
}
