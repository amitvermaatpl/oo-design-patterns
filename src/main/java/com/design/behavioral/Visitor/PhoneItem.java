package com.design.behavioral.Visitor;

public class PhoneItem implements ItemElement{
	
	private String phoneType;
	private int price;
	
	public PhoneItem(String phoneType, int price) {
		super();
		this.phoneType = phoneType;
		this.price = price;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
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
