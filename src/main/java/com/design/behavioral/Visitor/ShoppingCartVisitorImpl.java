package com.design.behavioral.Visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	public int visit(BookItem book) {
		int cost=0; 
		
        //apply 5$ discount if book price is greater than 50 		
		if(book.getPrice() > 50) {
			cost = book.getPrice() -5;
		}else {
			cost= book.getPrice();
		}
		System.out.println("Book Details::"+book.getBookName() + " cost ="+cost); 
		return cost;
	}

	public int visit(PhoneItem phone) {
		System.out.println("Android phone cost= "+ phone.getPrice());
		return phone.getPrice();
	}

	public int visit(FruitItem fruit) {
		int cost = fruit.getPricePerKg()*fruit.getWeight(); 
        System.out.println(fruit.getName() + " cost = "+cost); 
        return cost; 
	}

}
