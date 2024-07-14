package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for (int i=0;i<Links.size();i++)
{
	System.out.println("Link Url : " +Links.get(i).getAttribute("href"));
	System.out.println("Link Text : " +Links.get(i).getText());
}
		
	}
}