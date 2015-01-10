package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	String baseUrl;
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }
  @Test
  public void test(){
	  baseUrl ="http://www.google.com";
	  driver.get(baseUrl);
	  Assert.assertEquals("test", "test");
	  System.out.println("TestCase Passed");
  }
  @AfterTest
  public void closeBrowser() {
	  System.out.println("close Browser Function Before");
	  driver.quit();
	  driver.close();
	  System.out.println("close Browser Function After");
	  
  }
}
