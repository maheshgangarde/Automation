package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver",
				"C:\\Users\\maheshg\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// Step 1: Switch to frame if any
		// Step2 : Get Total Row count
		// step3 : Get Total Column count
		// setp4 : Iterate for loop between row and column

		// in this example no frame :
		List<WebElement> RowCount = driver.findElements(By.xpath("/html/body/div[3]/div[1]/fieldset/table/tbody/tr"));// get row size
		int Row = RowCount.size();
		System.out.println(Row);
		List<WebElement> ColumnCount = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[1]/th"));// get
																											// Column
																											// size
		int Column = ColumnCount.size();
		System.out.println(Column);

		for (int i = 1; i <= Row; i++) {
		    for (int j = 1; j <= Column; j++) {
		        WebElement cell = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[" + i + "]/td[" + j + "]"));
		        System.out.print(cell.getText() + "\t"); // Print the text of the cell
		    }
		    System.out.println();
		}

	}

}