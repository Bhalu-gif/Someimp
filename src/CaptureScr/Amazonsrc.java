package CaptureScr;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazonsrc
{
 
	@Test
	public void impmethod()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\new selinium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("Lipsticks");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("F:\\screen\\amz.jpeg"));
		System.out.println("screenshort taken ");
		driver.quit();
		
		
	} 
}
