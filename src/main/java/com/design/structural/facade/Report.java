package com.design.structural.facade;

public class Report {
	private ReportHeader header;
	private ReportData data;
	private ReportFooter footer;
	
	public ReportHeader getHeader() {
		return header;
	}
	public void setHeader(ReportHeader header) {
		System.out.println("Setting Report Header");
		this.header = header;
	}
	public ReportData getData() {
		return data;
	}
	public void setData(ReportData data) {
		System.out.println("Setting Report Data");
		this.data = data;
	}
	public ReportFooter getFooter() {		
		return footer;
	}
	public void setFooter(ReportFooter footer) {
		System.out.println("Setting Report Footer");
		this.footer = footer;
	}
	
}

class ReportHeader{
	
}
class ReportData{
	
}class ReportFooter{
	
}
