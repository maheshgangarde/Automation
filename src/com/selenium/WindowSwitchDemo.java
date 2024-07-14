package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowSwitchDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']")).click();
			Set<String> Windowhandles=driver.getWindowHandles();//To get all open windows
			Iterator<String> iterator = Windowhandles.iterator();
			String parentwindow=iterator.next();
			String Childwindow=iterator.next();
			driver.switchTo().window(Childwindow);//switch to specified window
			driver.findElement(By.name("UserFirstName")).sendKeys("Mahesh");
			driver.findElement(By.name("UserLastName")).sendKeys("Gangarde");
			
			
	}
}
		