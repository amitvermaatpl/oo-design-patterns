package com.design.behavioral.Visitor;

public class FruitItem implements ItemElement{
	private int pricePerKg; 
    private int weight; 
    private String name; 
    
	public FruitItem(int priceKg, int wt, String nm) 
    { 
        this.pricePerKg=priceKg; 
        this.weight=wt; 
        this.name = nm; 
    } 
   
    public int getPricePerKg()  
    { 
        return pricePerKg; 
    } 
   
    public int getWeight()  
    { 
        return weight; 
    } 
   
    public String getName() 
    { 
        return this.name; 
    }

	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this); 
	} 
   
  
}
