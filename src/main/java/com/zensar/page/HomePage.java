package com.zensar.page;

import com.cucumber.listener.Reporter;
import com.zensar.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Services")
    WebElement _link_service;

    public void clickOnServiceLink() {
        //Reporter coming from cucumber.listener to add test steps on the extent report
        Reporter.addStepLog("Clicking on service link: " + _link_service);
        clickOnElement(_link_service);
        log.info("Clicking on login link: " + _link_service);
    }


}
