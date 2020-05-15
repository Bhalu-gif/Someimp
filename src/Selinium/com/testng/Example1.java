package Selinium.com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 
{
  public String baseurl="https://www.amazon.in";
   
  String driverpath="F:\\new selinium drivers\\chromedriver_win32\\chromedriver.exe";
  public WebDriver driver;
  
  @Test
  public void verify()
  {
	  System.out.println("Launching Chrome Browser");
	  
	  System.setProperty("webdriver.chrome.driver",driverpath);
	  driver = new ChromeDriver();
	  driver.get(baseurl);
	  String expectedTitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
	  driver.close();
  }
}
