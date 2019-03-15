package com.design.behavioral.Visitor;

/*
 * With the help of visitor pattern, we can move the operational logic from the objects to another class.
 * Objects/visitable classes providing Accept() methods that accept a visitor.
 * And a Visitor Object should have visit() method which should be for every element.
 * 
 */
public class VisitorDemo {

	/*
	 * Shopping-Cart Client
	 */
	public static void main(String[] args) {
		ItemElement [] elements = new ItemElement[] {
										new BookItem("Java-Book", 300),
										new PhoneItem("Android", 9000),
										new FruitItem(80, 2, "Grapes")
								  };
		
		int total= calculatePrice(elements);
		System.out.println("Total Cost = "+total);

	}

	private static int calculatePrice(ItemElement[] elements) {
		ShoppingCartVisitor visitor= new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item: elements) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
	// REFER: https://www.geeksforgeeks.org/visitor-design-pattern/
}
