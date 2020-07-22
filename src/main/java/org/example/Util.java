package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.server.handler.CloseWindow;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class Util extends BasePage {

    public static void TypeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnElement(By by, int time) {
        driver.findElement(by).click();
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        org.openqa.selenium.support.ui.Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByValue(By by, String n) {
        Select select = new Select((driver.findElement(by)));
        select.selectByVisibleText(n);
    }

    public static void selectFromDropDownByIndex(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String getTextFromPage(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        return driver.findElement(by).getText();
    }

    public static void waitUntilElementToClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(by));

    }

    public void takeScreenShot(String ScreenShortName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(("src\\ScreenShot" + ScreenShortName + "png")));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}















