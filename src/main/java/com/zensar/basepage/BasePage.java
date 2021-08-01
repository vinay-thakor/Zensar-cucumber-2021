package com.zensar.basepage;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;

    //constructor
    public BasePage() {
        //for page factory
        PageFactory.initElements(driver, this);
        //for log4j
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/zensar/resources/propretyfile/log4j.properties");
    }
}
