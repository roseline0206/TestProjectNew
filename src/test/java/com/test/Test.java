package com.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String args[]) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\executables\\chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement closeLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeLogin.click();
		
		WebElement mensFootwear = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[1]/div/h2"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		js.executeScript("arguments[0].scrollIntoView();",mensFootwear);
	}
}
