package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6 
{
	ChromeDriver driver;
	@BeforeMethod
	public void browseLaunch()
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void liBRARY() throws InterruptedException
	{
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();//for signin
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dummy.java695");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dummy@123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Library']")).click();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='img']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	    driver.quit();
	}
}
