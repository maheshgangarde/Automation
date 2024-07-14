package com.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://saucedemo.com");
		driver.manage().window().minimize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));//Explicit wait
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[3]/iframe")) ;
		driver.switchTo().frame(frame);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Stay signed out']")));
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("text message")
				.ignoring(NoSuchElementException.class);
		
		driver.close();
		

	}

}
