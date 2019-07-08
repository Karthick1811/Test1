package com.test.test1;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void script1() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karthick\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca/");
		System.out.println("URL loaded successfully");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Test");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		takeSnapShot(driver);
		
		
		driver.manage().deleteAllCookies();
		
		driver.quit();


	  
  }


	 public static void takeSnapShot(WebDriver driver) throws Exception{
		 
		 
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		  // now copy the  screenshot to desired location using copyFile //method
		// FileUtils.copyFile(src, new File("C:/Users/Karthick/Desktop/Selenium/screenshots/" + LocalDateTime.now() + ".jpg"));
		 

		 FileUtils.copyFile(src, new File("C:/Users/Karthick/Desktop/Selenium/screenshots/" + "ss" + ".jpg"));
	      //  TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	                
	          //      String Filename = "C:\\Users\\Karthick\\Desktop\\Selenium\\screenshots\\" + LocalDateTime.now() + ".jpg" ;

	        	//	System.out.println(Filename);
	                
	               // String Filename = "aaaa.jpg";
	                
	            //    File DestFile=new File(Filename);


	                
	              //  FileUtils.copyFile(SrcFile, DestFile);
	 }

}



