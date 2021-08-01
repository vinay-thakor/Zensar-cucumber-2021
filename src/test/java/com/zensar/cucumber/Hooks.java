package com.zensar.cucumber;

import com.cucumber.listener.Reporter;
import com.zensar.basepage.BasePage;
import com.zensar.browserselector.BrowserSelector;
import com.zensar.loadproperty.LoadProperty;
import com.zensar.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {


    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("chrome");

    //Annotation from cucumber.api.java //if selected from junit will get null pointer exception
    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //Annotation from cucumber.api.java //if selected from junit will get null pointer exception
    //if Scenario is failing to take screenshot adding parameter as Scenario from cucumber
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            //declaring variable of screenShotPath & getting method from Utility, replacing spaces " " in Scenario with "_"
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
