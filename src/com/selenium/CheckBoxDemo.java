package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("checkBoxOption1")).click();//select Checkbox
		driver.findElement(By.name("checkBoxOption1")).click();//Deselect Checkbox
		driver.findElement(By.name("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.name("checkBoxOption2")).isSelected());
		WebElement AC= driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
		Actions action=new Actions(driver);//to scroll to the element
		action.moveToElement(AC);
		action.perform();
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
	}

}