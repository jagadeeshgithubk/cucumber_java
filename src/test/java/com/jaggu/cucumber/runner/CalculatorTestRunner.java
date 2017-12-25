package com.jaggu.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(        
monochrome = true,
format = { "pretty", "html:target/cucumber" },
glue = "com.jaggu.cucumber.steps",
features = "classpath:cucumber/calculator.feature"
)
public class CalculatorTestRunner {

}
