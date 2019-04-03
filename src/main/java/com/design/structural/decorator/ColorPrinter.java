package com.design.structural.decorator;

public class ColorPrinter extends PrinterDecorator{

	ColorPrinter(Printer printer) {
		super(printer);
	}
	
	@Override
	public void print() {
		System.out.print("Adding color..");
		printer.print();
	}

}
