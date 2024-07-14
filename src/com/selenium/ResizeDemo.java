package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver",
				"C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement Resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(Resize, 250, 130);

	}
}