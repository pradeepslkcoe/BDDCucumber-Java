package com.slk.app.stepDefinition;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"com.slk.app.stepDefinition"}
        ,plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )
public class TestRunner {

}
