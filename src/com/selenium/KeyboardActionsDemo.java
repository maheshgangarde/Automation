package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]"));
		WebElement target= driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]"));
		Actions action=new Actions(driver);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(target, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"nb-diff\"]")).getText());
		
}
}
		