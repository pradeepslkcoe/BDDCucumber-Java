package com.slk.app.Utils;

import com.slk.app.stepDefinition.LaunchBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class hooks extends LaunchBrowser {
    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }

    @After
    public void afterScenario(){
        driver.quit();
    }
}
