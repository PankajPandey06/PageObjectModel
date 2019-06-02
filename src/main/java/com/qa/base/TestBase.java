package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static Properties properties;
	public static WebDriver driver;

	public TestBase() {
		
			try {
			properties = new Properties();

//			FileInputStream fip = new FileInputStream(System.getProperty("G:/Selenium Workspace/PageObjectModel/src/main/java/com/qa/config/config.properties"));
			
			FileInputStream fip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/config/config.properties");
			
			properties.load(fip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	
	public static void initialization(){
		
		String browsername = properties.getProperty("browser");
		
		if(browsername.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "G:/Selenium Workspace/PageObjectModel/src/main/java/com/qa/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("FireFox")){
			
			System.setProperty("webdriver.chrome.driver", "G:/Selenium Workspace/PageObjectModel/src/main/java/com/qa/drivers/geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(properties.getProperty("URL"));
		
	}
	
	public static void teardown(){
		
		driver.quit();
	}

}
