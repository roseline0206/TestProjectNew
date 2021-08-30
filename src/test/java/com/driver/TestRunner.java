package com.driver;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
		 features = "features/flipkartsearch.feature"
		 ,glue={"com.test"},monochrome =true,strict=true)
public class TestRunner {
	
}
