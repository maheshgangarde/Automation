package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement DD= driver.findElement(By.name("dropdown-class-example"));
		Select s=new Select(DD);
		s.selectByValue("option1");
		s.selectByIndex(2);
		s.selectByVisibleText("Option3");
	}
}