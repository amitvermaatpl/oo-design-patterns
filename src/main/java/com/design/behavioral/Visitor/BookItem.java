package com.design.behavioral.Visitor;

public class BookItem implements ItemElement{
	
	private String bookName;
	private int price;
	
	public BookItem(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);		
	}

}
