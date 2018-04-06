package com.pluralsight.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class App {

	public static void main( String[] args ){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1459756\\Documents"
				+ "\\Utilities\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Assert.assertEquals("Google","Google");
		WebElement searchfield = driver.findElement(By.id("lst-ib"));
		searchfield.sendKeys("PluralSight");
		//searchfield.sendKeys(Keys.ENTER);
		searchfield.submit();
		WebElement imagesLink = driver.findElements(By.linkText("Imágenes")).get(0);
		imagesLink.click();
	}
}
