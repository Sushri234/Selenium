package com.mohs10.or;

import org.openqa.selenium.By;

public class HomePage {
	
	//Categories


/*	public static By Jewelry = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a");
	public static By chooseJewelry = By.xpath("//div[@class='product-item']//img[@title='Show details for Create Your Own Jewelry']");
	public static By addtocartJewelry = By.xpath("//input[@id='add-to-cart-button-71']");
	public static By addlength=By.xpath("//input[@id='product_attribute_71_10_16']"); */
	
	public static By books = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a");
	public static By book =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img");
	public static By addtocart =By.id("add-to-cart-button-13") ;
	public static By compareproduct =By.xpath("//input[@class=\"button-2 add-to-compare-list-button\"]");
	
	public static By computers =By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a");
	public static By computer =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img");
	public static By addtocart2 =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/a/img");
	public static By clickoncart =By.xpath("//*[@id=\"add-to-cart-button-31\"]");
	public static By compare =By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/input");
	
	public static By remove =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/div/p[1]/input");
	
	


	//To Register
	public static By lnkRegister = By.xpath("//a[@href=\"/register\"]");
	public static By rbGender = By.id("gender-female");
	public static By txtFirstname = By.id("FirstName");
	public static By txtLastname = By.id("LastName");
	public static By txtEmail = By.id("Email");
	public static By txtPassword = By.id("Password");
	public static By txtConfirmpassword = By.id("ConfirmPassword");
	public static By btnRegister = By.id("register-button");
	public static By btnContinue = By.xpath("//input[@value='Continue']");
}    

	
