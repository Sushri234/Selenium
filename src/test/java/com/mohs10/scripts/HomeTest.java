package com.mohs10.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
		String Excelfile="C:\\Users\\DELL\\eclipse-workspace\\Mohs10_TAF\\TestData\\Taf_data.xlsx";
		String Excelsheet="Sheet1";
		String Xlsheet1= "Sheet2";
		String URL1= "URL";
		String Scroll= "Scroll";
	
	//***********************Footer TestCases********************
/*	@Test
	public void Validate_title() throws Exception {
		CommonFuns cat = new CommonFuns();
	    cat.Title_validate();
		Thread.sleep(9000);
	}   */
		
	
	//******************* Validate Mohs10Logo and ThankyouEmail**************** 
/*		 		@Test
	   public void Validate_EmailbuttonAndLogo() throws Exception {
		CommonFuns cat = new CommonFuns();
		
		String Email= XLUtils.getStringCellData(Excelfile, Excelsheet, 1, 0);
	    String text=cat.Validate_EmailAndLogo(Email);
	    Assert.assertEquals(text, "Thank you for contacting us. We will get in touch with you shortly.");
		Thread.sleep(9000);    }  */
		
		
	//*****************Search functionality******************8
	/*	@Test
		public void Validate_Keyword() throws Exception {
			CommonFuns cat = new CommonFuns();
			
			String Keyword= XLUtils.getStringCellData(Excelfile, Xlsheet1, 1, 0);
		    String text=cat.Search_functionality(Keyword);
		    Assert.assertEquals(text, "Conclusion");
			Thread.sleep(9000);  
	
 }   */
		
	//******************ShowCase series page*******************
	/*	@Test
		public void Showcase_seriesPage() throws Exception {
			CommonFuns cat = new CommonFuns();
		    cat.Showcase_page();
			Thread.sleep(9000);  
		
	}	*/
		
	//******************YouTube Video click and pause**************
		@Test
		public void Showcase_series() throws Exception {
			CommonFuns cat = new CommonFuns();
			String URL= XLUtils.getStringCellData(Excelfile, URL1, 1, 0);
			System.out.println(URL);
			cat.ShowCaseSeries_Youtube(URL);
			Thread.sleep(2000); 
	}
	
}