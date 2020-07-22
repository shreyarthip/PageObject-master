package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class RegisterSuccessPage extends Util {

    private By _registerpage = By.xpath("//div[@class=\"result\"]");
    String expectedText = "Your registration completed";


    public void userIsOnRegisterPage() {
        getTextFromElement(_registerpage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(_registerpage, expectedText);


    }
}