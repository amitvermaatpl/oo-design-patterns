package com.design.structural.facade;

import javax.activation.DataSource;

/*
 * In this example, we are creating a report generator which has multiple steps to create any report. 
 * For example, it shall first create report header, footer, add data rows, format the report and then 
 * write the report in desirable format (pdf, html etc).

 * Using ReportGeneratorFacade, we will hide all these steps and and expose easy to use methods.
 * 
 */
public class ReportGeneratorFacade {
	
	/* 
	 * Using javax.DataSource, just to show the feel of actual implementation 
	 * 
	 */
	public void generateReport(ReportType type, DataSource datasource, String location) {
		
		if(type== null | datasource ==null) {
			// throw some exception
		}

		//Create report
        Report report = new Report();
         
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());
         
        //Get data from dataSource and set to ReportData object
         
        report.setData(new ReportData());
         
        //Write report
        ReportWriter writer = new ReportWriter();
        
        switch(type){
        	case HTML:
        		writer.writeReportInHTML(report, location);
        		break;
        		
        	case PDF:
        		writer.writeReportInPDF(report, location);
        		break;
        }
		
	}
}
