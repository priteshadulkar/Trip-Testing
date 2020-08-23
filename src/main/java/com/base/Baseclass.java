package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass {

	WebDriver driver ;
	@Test
	public  void openbrowser() throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
			
		 driver = new ChromeDriver();
		 driver.navigate().to("http://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		
		
		
	}
}
