package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
				 plugin={"pretty","html:target/cucumber-html-report/cucumber.html", "json:target/cucumber-reports/cucumber.json",
						"junit:target/cucumber-reports/cucumber.xml",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 monochrome = true
				)


//
//@RunWith(Cucumber.class)
//@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefinitions" }, monochrome = true, plugin = {
//		"html:target/cucumber-html-report/cucumber.html", "json:target/cucumber-reports/cucumber.json",
//		"junit:target/cucumber-reports/cucumber.xml",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })




public class TestRunner {
	
	

}