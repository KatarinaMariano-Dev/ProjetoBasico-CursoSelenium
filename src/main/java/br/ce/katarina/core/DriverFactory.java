package br.ce.katarina.core;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {
		
	}

	public static WebDriver getDriver() {
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver", "/Users/Katarina/Documents/Automatização de Testes/chromedriver.exe");
		//driver = new ChromeDriver();
		
		switch(Properties.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHROME:
				driver = new ChromeDriver();
				break;
			
		}
		
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
