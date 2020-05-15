package com.verify.komal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpage.pages.Loginpage;

public class NewTest 
{
  @Test
  public NewTest ()  
  {
	     System.setProperty("webdriver.chrome.driver","F:\\new selinium drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         Loginpage log=new Loginpage(driver);
         log.typeusername();
         
         log.typecont();
         
         log.typepassword();
         
         driver.quit();
  }
}
