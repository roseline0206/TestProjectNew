package com.test;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.driver.Driver;
import com.pages.Login_Pages;
import com.pages.Search_Pages;
import com.utilities.ReadPropertiesFile;

public class Flipkart_Login_Test extends Driver{
	
	Properties prop = ReadPropertiesFile.readPropertiesFile("readinput.properties");
	Login_Pages login_pages ;
	Search_Pages search_pages;
	
	
	@BeforeClass
	public void instantiate() {
		Driver.init(prop.getProperty("Browser"));
		Driver.driver.get(prop.getProperty("URL"));
		Driver.driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void testLogin_Negative() throws InterruptedException {
		login_pages = new Login_Pages();
		login_pages.userName_Field("santoshg53@gmail.com");
		login_pages.password_Field("tendulkar@10000");
		login_pages.login_Button_Field();
		Thread.sleep(5000);
		String text = login_pages.alert_msg_Field();
		Assert.assertEquals(text, "Your username or password is incorrect");
		login_pages.login_close_Field();
	}
	
	@Test(priority=1)
	public void search_For_Mobiles() throws InterruptedException {
		search_pages = new Search_Pages();
		search_pages.flipkart_Search_Field("Mobiles");
		search_pages.flipkart_Search_Button_Field();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void closeDriverInstance() {
		Driver.driver.quit();
	}
}
