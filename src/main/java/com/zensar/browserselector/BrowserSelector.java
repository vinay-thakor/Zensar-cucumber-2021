package com.zensar.browserselector;

import com.zensar.basepage.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserSelector extends BasePage {

    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().clearCache();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            log.info("Launching Chrome Browser");
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().clearCache();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            log.info("Firefox Browser Selected");
        } else if (browser.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().clearCache();
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            log.info("Opera Browser Selected");
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().clearCache();
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            log.info("IE Browser Selected");
        } else {
            System.out.println("Wrong Browser Selected");
            log.info("Incorrect Browser Selected");
        }
    }


}
