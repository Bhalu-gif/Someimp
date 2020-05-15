package Selinium.com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annoationprogram 
{
  public String baseurl="http://www.newtours.demoaut.com" ;
  public WebDriver driver;
  
  @BeforeTest
  public void seturl()
  {
	  System.setProperty("webdriver.chrome.driver","F:\\new selinium drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	  driver.get(baseurl);
	  driver.manage().window().maximize();
  }
  @Test
  public void verifytitle()
  {
	  String expectedTitle="Welcome: Mercury tours" ;
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @AfterTest
  public void end()
  {
	  driver.quit();
  }
  
}
