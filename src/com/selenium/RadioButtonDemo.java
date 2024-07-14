package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).isSelected();
		driver.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).isSelected();
		System.out.println(driver.findElements(By.name("radioButton")).size())	;
	}

}