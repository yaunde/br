package io.br.neko.demain;

import java.io.Serializable;
import java.util.Arrays;

public class Book implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO(  )
	 */
	private static final long serialVersionUID = 1L;

	private int bookId;

	private int superTypeId;

	private int subTypeId;

	private String bookName;

	private String introduce;

	private float price=0;

	private float nowPrice=0;

	private byte[] picture;
	
	
	private int pages;
	
	private String publisher;
	
	private String author;
	
	private String ISBN;

	private String inTime;

	private int newBooks;

	private int saleBooks;

	private int hostBooks;
	
	private int specialBooks;

	private int bookNum;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getSuperTypeId() {
		return superTypeId;
	}

	public void setSuperTypeId(int superTypeId) {
		this.superTypeId = superTypeId;
	}

	public int getSubTypeId() {
		return subTypeId;
	}

	public void setSubTypeId(int subTypeId) {
		this.subTypeId = subTypeId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getNowPrice() {
		return nowPrice;
	}

	public void setNowPrice(float nowPrice) {
		this.nowPrice = nowPrice;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}


	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String isbn) {
		ISBN = isbn;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public int getNewBooks() {
		return newBooks;
	}

	public void setNewBooks(int newBooks) {
		this.newBooks = newBooks;
	}

	public int getSaleBooks() {
		return saleBooks;
	}

	public void setSaleBooks(int saleBooks) {
		this.saleBooks = saleBooks;
	}

	public int getHostBooks() {
		return hostBooks;
	}

	public void setHostBooks(int hostBooks) {
		this.hostBooks = hostBooks;
	}

	public int getSpecialBooks() {
		return specialBooks;
	}

	public void setSpecialBooks(int specialBooks) {
		this.specialBooks = specialBooks;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", superTypeId=" + superTypeId + ", subTypeId=" + subTypeId + ", bookName="
				+ bookName + ", introduce=" + introduce + ", price=" + price + ", nowPrice=" + nowPrice + ", picture="
				+ Arrays.toString(picture) + ", pages=" + pages + ", publisher=" + publisher + ", author=" + author
				+ ", ISBN=" + ISBN + ", inTime=" + inTime + ", newBooks=" + newBooks + ", saleBooks=" + saleBooks
				+ ", hostBooks=" + hostBooks + ", specialBooks=" + specialBooks + ", bookNum=" + bookNum + "]";
	}
	
}
