package com.mohs10.reuse;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		// Registration process
				public void Register(String Firstname, String Lastname, String Email, String Pwd, String ConfirmPwd) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in DemoWeb shop");
					aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
					aDriver.click(HomePage.lnkRegister, "Register link");
					aDriver.click(HomePage.rbGender, "Radio button Gender");
					aDriver.type(HomePage.txtFirstname,  Firstname, "FirstName text box");
					aDriver.type(HomePage.txtLastname, Lastname, "LastName text box");
					aDriver.type(HomePage.txtEmail, Email, "Email text box");
					aDriver.type(HomePage.txtPassword, Pwd, "password text box");
					aDriver.type(HomePage.txtConfirmpassword, ConfirmPwd, "confirm password text box");
					aDriver.click(HomePage.btnRegister, "Register button");
					aDriver.click(HomePage.btnContinue, "Continue button");
				} 
				


		  //Categories
		  public void Categories() throws Exception 
		  {
			  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Category links");
				aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				/*aDriver.click(HomePage.Jewelry, "Performed click operation on jewelry link");
				aDriver.click(HomePage.chooseJewelry, "Performed click operation on jewelry link");
				aDriver.type(HomePage.addlength, "10", "length is added");
				aDriver.click(HomePage.addtocartJewelry, "Performed click operation on jewelry link");*/
				
				aDriver.click(HomePage.books, "performed click operation");
				aDriver.click(HomePage.book, "click on book");
				aDriver.click(HomePage.addtocart, "click on book");
				aDriver.click(HomePage.compareproduct, "click on book");
				aDriver.click(HomePage.computers, "click on book");
				aDriver.click(HomePage.computer, "click on book");
				//aDriver.click(HomePage.click, "click on book");
				aDriver.click(HomePage.addtocart2, "click on computer");
				aDriver.click(HomePage.clickoncart, "click on computer");
				aDriver.click(HomePage.compare, "click on computer");
				aDriver.click(HomePage.remove, "click on remove");
				
				
		  }
	}
			