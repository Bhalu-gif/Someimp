package com.wordpage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
 WebDriver driver;
  By username=By.name("usernameOrEmail");
  By cont=By.xpath("//button[@type='submit']");
  By password=By.xpath("//input[@type='password']");
  
  public Loginpage (WebDriver driver)
  {
	  this.driver=driver;
  }
  public void typeusername()
  {
	 driver.findElement(username).sendKeys("komal@123"); 
  }
  public void typecont()
  {
	  driver.findElement(cont).click();
  }
  public void typepassword()
  {
	  driver.findElement(password).sendKeys("admin23");
  }
  
}
