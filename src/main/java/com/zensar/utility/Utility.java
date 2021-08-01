package com.zensar.utility;

import com.zensar.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Utility extends BasePage {


    /*
     * This method will generate explicit wait
     */
    public void explicitWaitSeconds(int seconds, By by) {
        driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /*
     * This method will make the web driver wait until element become clickable
     */
    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    /*
     * This method will make the web driver wait until WebElement become clickable
     */
    public void waitUntilElementToBeClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /*
     * This method will  make the web driver wait until presence of element is located by locator
     */
    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /*
     * This method will  make the web driver wait until visibility of element is located by locator
     */
    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /*
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /*
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /*
     * This method will send text to an element
     */
    public void sendTextToElement(By by, String string) {
        driver.findElement(by).sendKeys(string);
    }

    /*
     * This method will send text to an element
     */
    public void sendTextToElement(WebElement element, String string) {
        element.sendKeys(string);
    }

    /*
     * This method will get text from an element
     * @return type method
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /*
     * This method will get text from an element
     * @return type method
     */
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByValue(string);
    }

    /*
     * This method will verify that an element is displayed
     * @return type method
     */
    public boolean elementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is displayed
     * @return type method
     */
    public boolean elementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is selected
     * @return type method
     */
    public boolean elementIsSelected(By by) {
        WebElement element = driver.findElement(by);
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is selected
     * @return type method
     */
    public boolean elementIsSelected(WebElement element) {
//       return element.isSelected();
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is enabled
     * @return type method
     */
    public boolean elementIsEnabled(By by) {
        WebElement element = driver.findElement(by);
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is enabled
     * @return type method
     */
    public boolean elementIsEnabled(WebElement element) {
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     * @return type method
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     * @return type method
     */
    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertEqualsMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertEquals(expectedText,actualText);
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertEqualsMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertEquals(expectedText,actualText);
    }

    /*
     * This method will verify Text using Assert.assertTrue and contains function
     */
    public void verifyTextAssertTrueContainsMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertTrue(str, actualText.contains(expectedText));
    }

    /*
     * This method will verify Text using Assert.assertTrue and contains function
     */
    public void verifyTextAssertTrueContainsMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertTrue(str, actualText.contains(expectedText));
    }

    /*
     * This method will store elements in the form of Array list
     * and then help sort the lists by ascending/descending order for String or alphabetical values
     */

    public void arrayListForEachLoopAssertEqualsForString(By by) {

        List<String> originalList = new ArrayList<>();

        List<WebElement> storedList = driver.findElements(by);

        for (WebElement element : storedList) {
            originalList.add(element.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(originalList);
        System.out.println("Expected result: " + originalList);
        Collections.sort(tempList);
        System.out.println("Actual result: " + tempList);
        Assert.assertEquals(originalList, tempList);
    }

    /*
     * This method will store elements in the form of Array list
     * and then help sort the lists by ascending/descending order for String or alphabetical values
     */

    public void arrayListForEachLoopAssertEqualsForString(List<WebElement> element) {

        List<String> originalList = new ArrayList<>();

        List<WebElement> storedList = element;

        for (WebElement element1 : storedList) {
            originalList.add(element1.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(originalList);
        System.out.println("Expected result: " + originalList);
        Collections.sort(tempList);
        System.out.println("Actual result: " + tempList);
        Assert.assertEquals(originalList, tempList);
    }

    /*
     * This method will generate random numbers
     * @return type method
     */
    public static String getRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /*
     * This method will generate random string
     * @return type method
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }


    /*
     * This method will return current Time stamp
     * @return type method
     */
    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    /*
     * This method will take the screenshot and add to screenshot folder
     * This method will required parameter like screenshot name and return destination path
     *
     * @parameter driver
     * @parameter screenshotName
     * @return type method
     */
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/demo/nopcommerce/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /*
     *  This method will take ScreenShot with current Time Stamp and returns screen shots path
     */

    /*
     * This method will take the screenshot and add to test-output/html folder
     * This method will required parameter like screenshot name and return the destination path
     *
     * @parameter fileName
     * @return type method
     */
    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /*
     * This method will take screen shot and store into screenshot folder
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/zensar/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * This method will stop the programme execution on a given element for milliseconds
     */
    public void sleepMethod(int millisec) throws InterruptedException {
        Thread.sleep(millisec);
    }

    /*
    Variable js declared globally to enable using
     JavascriptExecutor method for window scrolling
     */
    private JavascriptExecutor js;

    /*
     * This method will enable scrolling the browser window up, down & sideways
     */
    public void windowScrollUpOrDown(int x, int y) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ");");
    }



}
