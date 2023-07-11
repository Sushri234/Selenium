package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class HomePage {
	
	//Footer TestCases

    public static By Linkdln_logo = By.xpath("//i[@class=\"fab fa-linkedin\"]");
	public static By Youtube_logo  =By.xpath("//i[@class='fab fa-youtube']");
	public static By insta_logo =By.xpath("//a[@class=\"elementor-icon elementor-social-icon elementor-social-icon- elementor-repeater-item-954c7a8\"]");
	public static By Twitter_logo =By.xpath("//i[@class='fab fa-twitter']");
	
	
	//Validate Mohs10Logo and ThankyouEmail	
	public static By Mohs10_Link = By.xpath("//a[normalize-space()='Mohs10 Technologies']");
	public static By Mohs10_Logo = By.xpath("//div[@class='site-primary-header-wrap ast-builder-grid-row-container site-header-focus-item ast-container']//img[@alt='Mohs10 Technologies']");
	
	public static By Automation_forum =By.xpath("//a[normalize-space()='info@testautomationforum.com']");
	public static By OK =By.xpath("//input[@id='ff_3_email']");
	
	public static By Email =By.xpath("//input[@id='ff_3_email']");
	public static By submit =By.xpath("//button[normalize-space()='Submit']");
	public static By thankYouMessage =By.xpath("//p[contains(text(),'Thank you for contacting us. We will get in touch ')]");
	
	
	//Search Functionality
	public static By Keyword =By.xpath("//input[@title='Search']");
	public static By Search =By.xpath("//button[@class='hfe-search-submit']");
	public static By Heading =By.xpath("//h1[@class='page-title ast-archive-title']");
	
	public static By Read_Link =By.xpath("//p[@class='read-more']//a[@href='https://testautomationforum.com/optimizing-performance-of-your-e-commerce-apps-to-ensure-seamless-customer-experience/']");
	public static By Scroll =By.xpath("//p[16]//b[1]//span[1]");
	public static By Conclusion =By.xpath("//p[16]//b[1]//span[1]");
	
	public static By Like_button= By.xpath("//button[@aria-label='Like Button']");
	
	public static By Search1 =By.xpath("//button[@class='hfe-search-submit']");
	
	
	//ShowCase series page
	
	public static By Showcase =By.xpath("//a[normalize-space()='Showcase Series']");
	public static By series1 =By.xpath("//img[@alt='Showcase Series – ContextQA']");
	
	
	public static By series2 =By.xpath("//img[@alt='Showcase Series – Deepfactor']");
	public static By series3 =By.xpath("//img[@alt='Showcase Series – Tonic']");
	
	public static By series4 =By.xpath("//img[@alt='Showcase Series – Conformiq']");
	public static By series5 =By.xpath("//img[@alt='Showcase Series – Sahi Pro']");
	
	public static By series6 =By.xpath("//img[@alt='Showcase Series – Leapwork']");
	public static By series7 =By.xpath("//img[@alt='Showcase Series – Avo Automation']");
	
	public static By series8 =By.xpath("//img[@alt='Showcase Series – AccelQ']");
	public static By series9 =By.xpath("//img[@alt='Showcase Series – Lambdatest']");
	
	public static By series10 =By.xpath("//img[@alt='Showcase Series – Froglogic Squish']");
	public static By series11 =By.xpath("//img[@alt='Showcase Series – Testing-Whiz']");
	
	public static By series12 =By.xpath("//img[@alt='Showcase Series – SeaLights']");
	public static By series13 =By.xpath("//img[@alt='Showcase Series – AIEnsured']");
	
	public static By series14 =By.xpath("//img[@alt='Showcase Series – Simplify3x']");
//	public static By series15 =By.xpath("//img[@alt='Showcase Series  Qase.io']");
	
	
	//YouTube click and pause action in show case series
	
	public static By Showcase_YT =By.xpath("//a[normalize-space()='Showcase Series']");
	public static By Video1 =By.xpath("//img[@alt='Showcase Series – ContextQA']");

	public static By Video2 =By.xpath("//img[@alt='Showcase Series – Deepfactor']");
	public static By Video3 =By.xpath("//img[@alt='Showcase Series – Tonic']");
	
	
	
	}
	

	
	





	
