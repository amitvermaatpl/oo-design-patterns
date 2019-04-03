package com.design.structural.decorator;

public abstract class PrinterDecorator implements Printer {
	protected Printer printer;
	
	PrinterDecorator(Printer printer){
		this.printer=printer;
	}
	
	public void print() {
		printer.print();
	}
}
