package com.cucumber.project.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Karthik/eclipse-workspace/AmazonTestCucumber/src/test/resource/Features/amazonTest.feature", 
	glue = {"com/cucumber/project/amazontest"},
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class AmazonTestRunner {

}
