package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3
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
	// not able to locate like button
	@Test
	public void videoplay_like() throws InterruptedException
	{
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']")).click();//for signin
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dummy.java695");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();//username
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dummy@123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();//pwd
		
		Thread.sleep(3000);
		List<WebElement> ls=driver.findElements(By.id("video-title"));//play video
		System.out.println("total video"+ls.size());
		ls.get(3).click();
		Thread.sleep(2000);
		
		//not able to locate like button
		//driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();//for like
		//driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
		//driver.findElement(By.xpath("//button[@id='button']")).click();
		driver.findElement(By.xpath("//yt-icon-button[contains(@class='style-scope ytd-toggle-button-renderer')]")).click();
		
	  
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
