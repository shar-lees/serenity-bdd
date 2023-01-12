package com.rcg.starter;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src/test/resources/features",
		glue = "com.rcg.steps"
		)

public class CucumberTestSuite {

}
