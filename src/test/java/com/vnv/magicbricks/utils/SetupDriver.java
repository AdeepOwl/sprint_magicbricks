package com.vnv.magicbricks.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;
import com.vnv.magicbricks.config.BrowserInit;

public class SetupDriver {

	public static WebDriver driver;
	
	public static WebDriver getBrowserName() {
		
		String browser=BrowserInit.getBrowserName();
		if(browser.equalsIgnoreCase("chrome"))
			return chromeDriver();
		if(browser.equalsIgnoreCase("edge"))
			return edgeDriver();
		if(browser.equalsIgnoreCase("firefox"))
			return firefoxDriver();
		
		return null;
		
	}

	public static WebDriver chromeDriver() {

		String userProfile= "C:\\Users\\adeedv\\AppData\\Local\\Google\\Chrome\\User Data";
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		driver.manage().window().maximize();

		return driver;


	}

	public static WebDriver edgeDriver() {

		String userProfile= "C:\\Users\\adeedv\\AppData\\Local\\Microsoft\\Edge\\User Data";
		System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		driver = new EdgeDriver(options);
		options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		driver.manage().window().maximize();

		return driver;


	}
	public static WebDriver firefoxDriver() {

//		String userProfile= "C:\\Users\\adeedv\\AppData\\Local\\Microsoft\\Edge\\User Data";
		System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
		//FireFoxOptions options = new FireFoxOptions();
		driver=new FirefoxDriver();
//		options.addArguments("--user-data-dir="+userProfile);
//		options.addArguments("--profile-directory=Default");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--start-maximized");
		driver.manage().window().maximize();

		return driver;

	}

	public static void teardown() {
		
		driver.close();
        driver.quit();
		
	}
}
