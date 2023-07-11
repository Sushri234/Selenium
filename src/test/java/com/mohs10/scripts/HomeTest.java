package com.mohs10.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
		String Excelfile="C:\\Users\\DELL\\eclipse-workspace\\Mohs10_TAF\\TestData\\Taf_data.xlsx";
		String Sheet= "Sheet1";
	
	//***********************Footer TestCases********************
	@Test(priority = 0)
	public void Validate_title() throws Exception {
	
	    String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
	    CommonFuns cat = new CommonFuns();
	    cat.Title_validate(URL);
		Thread.sleep(9000);
	}  
		
	
	//******************* Validate Mohs10Logo and ThankyouEmail**************** 
	   @Test(priority = 1)
	   public void Validate_Logo() throws Exception {
		 			
		String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		
		CommonFuns cat = new CommonFuns();
	    boolean logo=cat.Validate_Logo(URL);
	    Assert.assertEquals(logo,true);
		Thread.sleep(9000);    
		} 
	   @Test(priority = 2)
	   public void Validate_Email() throws Exception {
		 			
		String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		String Email= XLUtils.getStringCellData(Excelfile, Sheet, 1, 3);
		
		CommonFuns cat = new CommonFuns();
	    String text=cat.Validate_Email(Email, URL);
	    Assert.assertEquals(text, "Thank you for contacting us. We will get in touch with you shortly.");
		Thread.sleep(9000);    
		}  
	
		
	//*****************Search functionality******************8
	   @Test(priority = 3)
		public void Validate_Keyword() throws Exception {
			CommonFuns cat = new CommonFuns();
			
			String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
			String Keyword= XLUtils.getStringCellData(Excelfile, Sheet, 1, 2);
		    
			String heading=cat.Validate_keyword(Keyword, URL);
		    Assert.assertEquals(heading, "Search Results For: Performance");
		    System.out.println(heading);
			Thread.sleep(9000);  
	
 }   
	   @Test(priority = 4)
		public void Validate_readlink() throws Exception {
			CommonFuns cat = new CommonFuns();
			
			String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		    
		    String text=cat.Validate_Readlink(URL);
		    Assert.assertEquals(text, "Conclusion ");
		    System.out.println(text);
			Thread.sleep(9000);  
	
 }   
	
		
	//******************ShowCase series page*******************
	   @Test(priority = 5)
		public void Showcase_seriesPage() throws Exception {
			
			String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
			CommonFuns cat = new CommonFuns();
		    cat.Showcase_page(URL);
			Thread.sleep(9000);  
		
	}
	
	//******************YouTube Video click and pause**************
	
	   @Test(priority = 6)
	  public void Showcase_series() throws Exception {
		  
		  String URL= XLUtils.getStringCellData(Excelfile, Sheet, 2, 0);
		  String SC_URL= XLUtils.getStringCellData(Excelfile, Sheet, 1, 0);
		  CommonFuns cat = new CommonFuns();
	      cat.ShowCaseSeries_Youtube(URL,SC_URL);
	      Thread.sleep(2000);
	  }
	 
	
}