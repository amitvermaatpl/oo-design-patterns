package com.design.behavioral.Visitor;

public interface ShoppingCartVisitor {
	int visit(BookItem book);
	int visit(PhoneItem phone);
	int visit(FruitItem fruit);
}
