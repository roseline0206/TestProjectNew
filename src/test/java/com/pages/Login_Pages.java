package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driver.Driver;

public class Login_Pages extends Driver{

	@FindBy(xpath ="//input[@class='_2IX_2- VJZDxU']")
	WebElement userName ;
	
	@FindBy(xpath ="//input[@type='password']")
	WebElement passWord ;
	
	@FindBy(xpath ="(//button[@type='submit'])[2]")
	WebElement login_Button ;
	
	@FindBy(xpath = "//span[@class='_2YULOR']")
	WebElement alert_msg;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement login_close;
	
	public Login_Pages() {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public void userName_Field(String username) {
		userName.sendKeys(username);
	}
	
	public void password_Field(String password) {
		passWord.sendKeys(password);
	}
	
	public void login_Button_Field() {
		login_Button.click();
	}
	
	public String alert_msg_Field() {
		return alert_msg.getText();
	}
	
	public void login_close_Field() {
		login_close.click();
	}
}
