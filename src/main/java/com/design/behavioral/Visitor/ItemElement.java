package com.design.behavioral.Visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
