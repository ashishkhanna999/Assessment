package com.bdd.stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/Features", glue = { "com.bdd.stepDefinitions",
		"com.bdd.intailSetup" }, tags = { "~@Ignore" }, plugin = { "pretty", "html:target/cucumber",
				"json:target/cucumber/cucumber.json", }, monochrome = true)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
