package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Iframe extends Util {
    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    String Expected = "Not a Friendly Topic";
    private By _AnimalName = By.xpath("//select");

    public void SwichIframe(){
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        String URL = driver.getCurrentUrl();
        String Expected = "https://chercher.tech/practice/frames-example-selenium-webdriver";
        Assert.assertEquals(URL, Expected);

    }
    public void animalName(){
        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);
        TypeText(_TypeTopicName, "Animal Name");

        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3);
        clickOnElement(_CheckBox, 40);
        driver.switchTo().defaultContent();

        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.switchTo().frame("frame2");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(_AnimalName));
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        select.selectByVisibleText("Avatar");

}
}