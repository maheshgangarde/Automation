package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/controlgroup/");
		driver.manage().window().maximize();
		//Get current timestamp
		Date Currentdate= new Date();
		String FileName=Currentdate.toString().replace(" ", "-").replace(":", "-");
		File Screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//take screenshot
		FileUtils.copyFile(Screenshot, new File(".//Screenshot//" + "Screenshot" + FileName + ".Png"));//save screenshot in local machine
}
}
		