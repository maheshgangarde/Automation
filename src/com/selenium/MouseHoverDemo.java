package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	WebElement Mouse = driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
	WebElement Scroll = driver.findElement(By.xpath("/html/body/div[5]/fieldset/legend"));
	Actions action=new Actions(driver);
	action.moveToElement(Scroll).perform();
	action.moveToElement(Mouse).perform();
	List<WebElement> Data = driver.findElements(By.xpath("/html/body/div[4]/div/fieldset/div/div"));
	for(int i=0;i<Data.size();i++)
	{
		System.out.println("Options are : "+Data.get(i).getText());
	}
}
}
		