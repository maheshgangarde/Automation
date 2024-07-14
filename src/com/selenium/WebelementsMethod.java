package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Test01");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]\"")).clear();
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("test404");

	}

}
