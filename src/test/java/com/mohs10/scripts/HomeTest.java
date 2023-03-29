package com.mohs10.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
	//Clicking on Categories links #4
	@Test
	public void CategoriesTest() throws Exception {
		CommonFuns cat = new CommonFuns();
	    cat.Categories();
		Thread.sleep(9000);
	}
	
	
	@Test
	public void RegisterPageTestCase() throws Exception {
		CommonFuns hm = new CommonFuns();
			  hm.Register("Misti", "Kohli", "manikoli@hotmail.com", "Tesla@4443", "Tesla@4443");
			  Thread.sleep(7000);   
			 
		  }
	}
	
	
