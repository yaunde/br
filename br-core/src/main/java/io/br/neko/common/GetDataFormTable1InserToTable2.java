package io.br.neko.common;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetDataFormTable1InserToTable2 {
	List<TempBean> all = new ArrayList<TempBean>();
	
	public List<TempBean> getBooks() {
		PreparedStatement pstmt = null;
		DbUtil dbUtil = null;
		ResultSet rs = null;
		String sql = null;

		// 显示所有书籍
		sql = "SELECT BookTitle,BookAuthor,bx_books.ISBN,Publisher,ImageURLM,YaearOfPublication FROM bx_books";
		try {
			dbUtil = new DbUtil();
			pstmt = dbUtil.getCon().prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				TempBean book = new TempBean();

				book.setBookName(rs.getString("BookTitle"));
				book.setISBN(rs.getString("ISBN"));
				book.setPublidate(rs.getInt("YaearOfPublication"));
				book.setAuthor(rs.getString("BookAuthor"));
				book.setPublisher(rs.getString("Publisher"));
				book.setbPhoto(rs.getString("ImageURLM"));

				all.add(book);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				dbUtil.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return all;

	}
	
	
	public boolean addBook(List<TempBean> book) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		DbUtil dbUtil = null;
		String sql = "insert into tb_book(bookName,author,ISBN,publisher,bPhoto,YearOfPublication) values(?,?,?,?,?,?)";
		try {
			dbUtil = new DbUtil();
			pstmt = dbUtil.getCon().prepareStatement(sql);
			for (int i = 0; i < book.size(); i++) {
				
				pstmt.setString(1, book.get(i).getBookName());
				pstmt.setString(2, book.get(i).getAuthor());
				pstmt.setString(3, book.get(i).getISBN());
				pstmt.setString(4, book.get(i).getPublisher());
				pstmt.setString(5, book.get(i).getbPhoto());
				pstmt.setInt(6, book.get(i).getPublidate());
				pstmt.addBatch();
				/*int ij = pstmt.executeUpdate();
				if (ij != 0) {
					// 插入书籍成功
					System.out.println(""+flag);
					return flag;
				}*/
			}
			pstmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void main(String[] args) {
		GetDataFormTable1InserToTable2 tt = new GetDataFormTable1InserToTable2();
		tt.all=tt.getBooks();
		System.out.println(tt.all.size());
		
		tt.addBook(tt.all);
		
		
	}
}
