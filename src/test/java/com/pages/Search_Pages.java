package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driver.Driver;

public class Search_Pages extends Driver{

	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement search_Field;

	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	WebElement search_button_Field;
	
	@FindBy(xpath = "//a[@title='Mobiles']")
	WebElement mobiles_text;

	public Search_Pages() 
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}

	public void flipkart_Search_Field(String search) {
		search_Field.sendKeys(search);
	}

	public void flipkart_Search_Button_Field() {
		search_button_Field.click();
	}
	
	public String mobile_text_field() {
		return mobiles_text.getText();
	}
}
