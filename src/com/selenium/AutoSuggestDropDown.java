package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		/*WebElement Test= driver.findElement(By.xpath("//input[@placeholder='From']"));
		Test.sendKeys("Mumbai");
		Test.sendKeys(Keys.ARROW_DOWN);
		Test.sendKeys(Keys.ENTER);
		driver.close();
		*/
		driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
	}
}