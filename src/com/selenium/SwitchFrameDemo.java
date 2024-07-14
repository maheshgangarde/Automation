package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchFrameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.switchTo().frame("courses-iframe"); // switch to frame
		WebElement A = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/a"));
		Actions action = new Actions(driver);
		action.moveToElement(A);
		action.perform();
		driver.findElement(By.xpath("//a[text()='JOIN NOW']")).click();
		driver.switchTo().parentFrame();//parent frame
		WebElement B = driver.findElement(By.xpath("/html/body/h1"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(B);
		action1.perform();
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
		
		
	}

}