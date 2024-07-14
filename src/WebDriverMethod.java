

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\maheshg\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://saucedemo.com");
		driver.manage().window().minimize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		//driver.close();
		

	}

}
