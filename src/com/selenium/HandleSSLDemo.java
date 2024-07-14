package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver",
				"C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		//Set Global Capabilities profiles
		DesiredCapabilities dc =new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions Coptions= new ChromeOptions();
		Coptions.merge(dc);
		ChromeDriver driver = new ChromeDriver(Coptions);
		driver.get("http://expired.badssl.com/");
		driver.manage().window().maximize();
		

	}
}