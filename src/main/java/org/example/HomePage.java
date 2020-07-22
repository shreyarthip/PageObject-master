package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends  Util {
    private By _registerButton = By.linkText("Register");
    private By _Computer = By.linkText("Computers");
    private By _Books = By.linkText("Books");
    private By _searchInputBox = By.id("small-searchterms");
    private By _WelcomeTitleText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expectedTitleOfThePage = "Welcome to our store";
    private By _searchButton = By.xpath("//input[@class=\"button-1 search-box-button\"]");
    private By _FaceBook = By.linkText("Facebook");
    private By _NewDetailsButton = By.xpath("//div[@class=\"news-list-homepage\"]//div[1]/div[3]/a[1]");
    private By _CurrencySelect = By.xpath("//select[@id=\"customerCurrency\"]");

    public void verifyUserOnHomePage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getTextFromElement(_WelcomeTitleText);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Assert.assertEquals(_WelcomeTitleText, expectedTitleOfThePage);
    }
    public void clickOnRegisterButton() {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        clickOnElement(_registerButton,20);
    }
    public void ClickOnComputer(){
        clickOnElement(_Computer,20);
    }
    public void clickOnBooks(){
        clickOnElement(_Books,20);
    }

    public void clickOnSearchButton() {
        clickOnElement(_searchButton, 20);
    }

    public void CurrencySelect(){
        clickOnElement(_CurrencySelect,30);
    }

    public void Selectcurrency() { //Method to select currency from homepage

      clickOnElement(_CurrencySelect,30);

        Select currency = new Select(driver.findElement(_CurrencySelect));//select Euro currency
        currency.selectByVisibleText("Euro");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> ProductName = driver.findElements(By.className("prices"));
        for (WebElement Product : ProductName) //For each loop for confirming currency symbol of four products
            System.out.println(Product.getText().contains("")); // Print result of four products with Euro and prices
    }
    public void Assertcurrency () { //Method to assert currency and symbol

        String expectedTitle = "€21.50";
        String actualText1 =getTextFromElement(By.xpath("//span[text()='€21.50']"));
        Assert.assertEquals(actualText1, expectedTitle);

    }
    public void verifyUserSeeAlertMassage() {

        String alertMassage = driver.switchTo().alert().getText();
        String Expected = "Please enter some search keyword";
        Assert.assertEquals(alertMassage, Expected);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
    }
    public void FaceBook(){
        clickOnElement(_FaceBook,30);
    }
    public void clickOnDetailsButton(){
      clickOnElement(_NewDetailsButton,30);
    }
}


