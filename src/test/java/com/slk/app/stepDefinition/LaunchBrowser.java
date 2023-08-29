package com.slk.app.stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public WebDriver driver;
    //This is a demo script

    @Given("Chrome browser is launched")
    public void chromeBrowserIsLaunched() {
        driver=new ChromeDriver();
        driver.get("https://www.wikipedia.com");
    }
    @Then("Verify the page title")
    public void verifyThePageTitle() {
        System.out.println((driver.getTitle()));
    }


}
