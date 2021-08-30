package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static void init(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\executables\\chromedriver.exe");
			System.out.println(System.getProperty("user.dir"));
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir") + "\\executables\\firefoxdriver.exe");
			System.out.println(System.getProperty("user.dir"));
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\executables\\iedriver.exe");
			System.out.println(System.getProperty("user.dir"));
			driver = new InternetExplorerDriver();
		}  else {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\executables\\edgedriver.exe");
			System.out.println(System.getProperty("user.dir"));
			driver = new EdgeDriver();
		} 
	}

}
