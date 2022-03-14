package com.vnv.magicbricks.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import com.vnv.magicbricks.utils.SetupDriver;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(strict = true, 
plugin = {"pretty","html:target/html-reports/report.html"},
features = {"src/test/resources/magicbricks/Rent.feature"}, 
glue = {"com.vnv.magicbricks.steps"},
monochrome = true,
tags = {"@RentingPropertyType_House"})

public class MagicBricksRunner extends AbstractTestNGCucumberTests {

	 @DataProvider(parallel = true)

	    public Object[][] scenarios() {
	        return super.scenarios();
	    }

	    @AfterSuite
	    public void teardown() {
	        SetupDriver.teardown();
	    }
	
}
