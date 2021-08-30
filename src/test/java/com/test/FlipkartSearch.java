package com.test;

import org.junit.Assert;

import com.driver.Driver;
import com.pages.Login_Pages;
import com.pages.Search_Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartSearch extends Driver{
	Search_Pages search_pages;
	Login_Pages login_pages;
	
	@Given("^A application called Flipkart to test$")
	public void a_application_called_Flipkart_to_test() throws Throwable {
		Driver.init("Chrome");
		Driver.driver.get("https://www.flipkart.com");
		Driver.driver.manage().window().maximize();
	}

	@When("^user clicks on close button$")
	public void user_clicks_close_button() throws Throwable {
		login_pages = new Login_Pages();
		login_pages.login_close_Field();
	}
	
	@And("^user enters the mobiles in search field$")
	public void user_enters_the_mobiles_in_search_field() throws Throwable {
		search_pages = new Search_Pages();
		search_pages.flipkart_Search_Field("Mobiles");
	}

	@And("^user clicks on Search Button$")
	public void user_clicks_on_Search_Button() throws Throwable {
		search_pages = new Search_Pages();
		search_pages.flipkart_Search_Button_Field();
		Thread.sleep(3000);
	}

	@Then("^user validates to check mobiles are displayed$")
	public void user_validates_to_check_mobiles_are_displayed() throws Throwable {
		search_pages = new Search_Pages();
		String actual = search_pages.mobile_text_field();
		Assert.assertEquals("Mobiles", actual);
	}
	
	@Then("^user validates to check mobiles are displayed$")
	public void user_validates_to_check_mobiles_are_displayed1() throws Throwable {
		search_pages = new Search_Pages();
		String actual = search_pages.mobile_text_field();
		Assert.assertEquals("Mobiles", actual);
	}
}
