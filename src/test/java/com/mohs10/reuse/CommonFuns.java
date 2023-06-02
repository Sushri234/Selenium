package com.mohs10.reuse;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.mohs10.base.StartBrowser;
import com.mohs10.or.HomePage;
import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.Actionitem;
import com.mohs10.ActionDriver.XLUtils;

	public class CommonFuns {
		public Actionitem aaDriver;
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aaDriver= new Actionitem();
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		
		
		
	//******************************** Footer TestCases***********************************
		   
/*			public void Title_validate() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate the title of all page");
					aDriver.navigateToApplication("https://testautomationforum.com/");
					
					aDriver.click(HomePage.Linkdln_logo, "Click on Linkdlnlogo");
					
					Set<String> windowHandles = driver.getWindowHandles();
					// Store the handle of the parent window
					String parentWindowHandle = driver.getWindowHandle();
					// Iterate through the window handles to switch to the child window
					for (String windowHandle : windowHandles) {
					    if (!windowHandle.equals(parentWindowHandle)) {
					        driver.switchTo().window(windowHandle);
					        break;
					    }
					}
					// Perform actions on the child window
					
                    aDriver.switchToNewWindow(driver);
					aaDriver.Title_validate(driver, "Test Automation Forum (TAF) | LinkedIn");
				    Thread.sleep(3000);
					driver.close();

					// Switch back to the parent window
					driver.switchTo().window(parentWindowHandle);
					System.out.println("go to parent window");
					
					
					 aDriver.click(HomePage.Youtube_logo, "Click on Youtubelogo");
					 aDriver.switchToNewWindow(driver);
                     aaDriver.Title_validate(driver,"Test Automation Forum (TAF) - YouTube");
                     Thread.sleep(3000);
 				     driver.close();
					  
 				  //Switch back to the parent window
 		       	    driver.switchTo().window(parentWindowHandle);
 					System.out.println("go to parent window");
					 
				    aDriver.click(HomePage.insta_logo, "click on insta logo");
					aDriver.switchToNewWindow(driver);
					//aaDriver.Title_validate(driver,"Page not found • Instagram");
					aaDriver.Title_validate(driver,"Test Automation Forum (TAF) (@test_automation_forum) on Instagram");
					Thread.sleep(3000); driver.close();
					  
					// Switch back to the parent window
					driver.switchTo().window(parentWindowHandle);
					System.out.println("go to parent window");
					 
		 			aDriver.click(HomePage.Twitter_logo, "click on Twitter logo");
				    aDriver.switchToNewWindow(driver);
		            aaDriver.Title_validate(driver,"Test Automation Forum (@Testautoforum) / Twitter");
		            Thread.sleep(3000);
		 		    driver.close();    
				}  
				}  */
	
   //**************************************** Validate Mohs10Logo and ThankyouEmail***********************************	
			/*	public String Validate_EmailAndLogo(String Email) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate Email & Mohs10Logo");
					aDriver.navigateToApplication("https://testautomationforum.com/");
					
					aDriver.click(HomePage.Mohs10_Logo, "Click on M10 logo");
					Thread.sleep(3000);
					driver.navigate().back();
					Thread.sleep(3000);
					aDriver.click(HomePage.Automation_forum, "Click on forum");
					aDriver.click(HomePage.OK, "Click on cancel");
					
		 			aDriver.type(HomePage.Email,Email, "type your mail id");
					aDriver.click(HomePage.submit, "Click on submit button");
					String msg = aDriver.getText(HomePage.thankYouMessage, "Get the text message");
					return msg;
					
				        }
					
				}   */
				
//************************************Search functionality*********************************
				
		/*		public String Search_functionality(String Keyword) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate Keyword and read_link");
					aDriver.navigateToApplication("https://testautomationforum.com/");
				//Click on search button by entering a keyword
					aDriver.type(HomePage.Keyword,Keyword, "write one keyword");
					aDriver.click(HomePage.Search, "search for this keyword");
					aaDriver.Title_validate(driver,"You searched for Performance - Test Automation Forum");
		            Thread.sleep(3000);
		            driver.navigate().back();
					
		            aDriver.click(HomePage.Read_Link, "click on read link");
		         //Scroll Down
		            aaDriver.Scroll_down(HomePage.Scroll);
		            
					String conclusion=aDriver.getText(HomePage.Conclusion, "Conclusion Text");
					
					aDriver.click(HomePage.Like_button, "click on read link");
					System.out.println("Thanks you! Liked this");
					driver.navigate().back();
					driver.navigate().back();
					driver.navigate().refresh(); 
				//Click on search button without entering anything
					aDriver.click(HomePage.Search1, "Search for keyword");
					
					return conclusion;
				}
	}	*/
  //**************************************ShowCase series page***************************************
					
		        /*    public void Showcase_page() throws Exception
				    {
						StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate title of the ShowCase series page");
						aDriver.navigateToApplication("https://testautomationforum.com/");
						
					    aDriver.click(HomePage.Showcase, "click on showcase series page");
						aDriver.click(HomePage.series1, "Click on 1st series");
						aaDriver.Title_validate(driver, "Test Automation Forum Showcase Series – ContextQA Showcase Series -");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series2, "Click on 2nd series");
						aaDriver.Title_validate(driver, "Test Automation Forum Showcase Series – Deepfactor Showcase Series -");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series3, "Click on 3rd series");
						aaDriver.Title_validate(driver, "Test Automation Forum Showcase Series – Tonic Showcase Series -");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series4, "Click on 4th series");
						aaDriver.Title_validate(driver, "Test Automation Forum Showcase Series – Conformiq Showcase Series -");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series5, "Click on 5th series");
						aaDriver.Title_validate(driver, "Showcase Series – Sahi Pro");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series6, "Click on 6th series");
						aaDriver.Title_validate(driver, "Showcase Series – Leapwork");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series7, "Click on 7th series");
						aaDriver.Title_validate(driver, "Showcase Series – Avo Automation");
						driver.navigate().back();
						
						aDriver.click(HomePage.series8, "Click on 8th series");
						aaDriver.Title_validate(driver, "Showcase Series – AccelQ");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series9, "Click on 9th series");
						aaDriver.Title_validate(driver, "Showcase Series – Lambdatest");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series10, "Click on 10th series");
						aaDriver.Title_validate(driver, "Showcase Series – Froglogic Squish");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series11, "Click on 11th series");
						aaDriver.Title_validate(driver, "Showcase Series – Testing-Whiz");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series12, "Click on 12th series");
						aaDriver.Title_validate(driver, "Showcase Series - SeaLights");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series13, "Click on 13th series");
						aaDriver.Title_validate(driver, "Showcase Series - AIEnsured");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series14, "Click on 14th series");
						aaDriver.Title_validate(driver, "Showcase Series - Test Automation Forum");
						driver.navigate().back();
						Thread.sleep(2000);
						
						aDriver.click(HomePage.series15, "Click on 15th series");
						aaDriver.Title_validate(driver, "Showcase Series - Qase.io");
					} 
	          }*/
		
		
      //********************************YouTube Video click and pause action in show case series************************
		
		 public void ShowCaseSeries_Youtube(String URL) throws Exception
		  {
		   StartBrowser.childTest = StartBrowser.parentTest.createNode("Validate video for each Showcase series");
		   aDriver.navigateToApplication("https://testautomationforum.com/");
			
		   aDriver.click(HomePage.Showcase_YT, "Click on 1st series");
	    //1st Video
		   aDriver.click(HomePage.Video1, "Click on 1st series");
		   Thread.sleep(2000);
		//It will scroll down to the page
		   WebElement scrool= driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-78bce02 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].scrollIntoView();", scrool);
		
		//create the object of screen class For Click operation on video
            Screen screen = new Screen();
		    Pattern play = new Pattern(URL);
		
		    screen.wait(play, 1000);
		    screen.click(play);

		    Thread.sleep(5000);
		    Actions actions = new Actions(driver);
            // Move the mouse to the video element to make it visible
		    actions.moveToElement(scrool).perform();
            // Wait for the video to start playing
		    Thread.sleep(2000);
            // Pause the video
		    actions.moveByOffset(0, 0).click().perform();
		    Thread.sleep(3000);
		    
		//2nd Video 
		    driver.navigate().back();
		    Thread.sleep(2000);
		    aDriver.click(HomePage.Video2, "Click on 1st series");
			Thread.sleep(2000);
		//It will scroll down to the page
			WebElement scrool1= driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-78bce02 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].scrollIntoView();", scrool1);
			
			Pattern play1 = new Pattern(URL);
			
			screen.wait(play1, 1000);
			screen.click(play1);

			Thread.sleep(5000);
			Actions action1 = new Actions(driver);
		    action1.moveToElement(scrool1).perform();
		    Thread.sleep(2000);
            // Pause the video
		    actions.moveByOffset(0, 0).click().perform();
		    Thread.sleep(3000);
			    
		 //3rd Video 
			    driver.navigate().back();
			    Thread.sleep(2000);
			    aDriver.click(HomePage.Video3, "Click on 1st series");
				Thread.sleep(2000);
				
				WebElement scrool2= driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-78bce02 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].scrollIntoView();", scrool2);
				
				Pattern play2 = new Pattern(URL);
				
				screen.wait(play2, 1000);
				screen.click(play2);

				Thread.sleep(5000);
				Actions action2 = new Actions(driver);
				action2.moveToElement(scrool2).perform();
				Thread.sleep(2000);
		        // Pause the video
				actions.moveByOffset(0, 0).click().perform();
				Thread.sleep(3000);
				    } 
					   }
			    
		    
		 
			
	

	
			