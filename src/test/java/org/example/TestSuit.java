package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.print.Book;
import java.util.List;

import static java.awt.SystemColor.desktop;

public class TestSuit extends BaseTest {
    //create Object of HomePage
    HomePage homePage = new HomePage();
    //create Object of  RegisterPage
    RegisterPage registerPage = new RegisterPage();
    //create Object of  RegisterSuccessPage
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    //create Object of Computer
    Computer computer = new Computer();
    //create Object of Desktop
    Desktop desktop = new Desktop();
    //create Object of BookCart
    BookCart bookCart = new BookCart();
    //Create Object of Facebook
    FacebookPage facebookPage = new FacebookPage();
    //Create Object of NewOnLineStore
    NewOnlineStore newOnlineStore = new NewOnlineStore();
    //Create Object of IFrame
    Iframe iframe = new Iframe();


    @Test(priority = 1)
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        //verify user is on homepage
        // homePage.verifyUserOnHomePage();
        //click on register button
        homePage.clickOnRegisterButton();
        //user Enter Registration Details
        registerPage.userEnterRegistrationDetails();
        //user Click On Register Submit-Button
        registerPage.userClickOnRegisterSubmitButton();
    }

    @Test(priority = 2)
    public void userShouldBeAbleToEmailAFriendSuccessfully() {
        //click on RegisterButton
        homePage.clickOnRegisterButton();
        //user Enter Register Details
        registerPage.userEnterRegistrationDetails();
        //user click on Register SubmitButton
        registerPage.userClickOnRegisterSubmitButton();
        homePage.ClickOnComputer();
        // user Click On Desktop
        computer.userClickOnDesktop();
        //user click on Email friend
        desktop.ClickOnEmailFriend();
    }

    @Test(priority = 3)
    public void userShouldBeAbleToAddTheItemInCartSuccessfully() {
        //click on Books
        homePage.clickOnBooks();
        //user Enter Add to cart
        bookCart.userEnterItemAddToCart();
    }


    @Test (priority = 4)
    public void verifyEachProductHaveName() {
        List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));

        for (WebElement Product : ProductName) {
            System.out.println(Product.getText());

        }
    }

    @Test (priority = 5)
    public void Alert() {
        //User click on Search button
        homePage.clickOnSearchButton();
        //User See Alert Massage
        homePage.verifyUserSeeAlertMassage();
    }

    @Test (priority = 6)
    public void userClickOnFaceBookButton() {
        //Click on Facebook
        homePage.FaceBook();
        //User is on FaceBookPage
        facebookPage.UserIsOnHomeFaceBookPage();
        //Assert for URL
        facebookPage.AssertForURL();

    }

    @Test (priority = 7)
    public void CheckingAssertForCreatePage() {
        homePage.FaceBook();
        // User is on Home facebook page
        facebookPage.UserIsOnHomeFaceBookPage();
        //Assert for CreatePage
        facebookPage.AssertForCreatePage();
        //Assert By Colour
        facebookPage.assertByColour();
        // facebookPage.CloseDriver();
    }

    @Test (priority = 8)
    public void UserOnNewOnlineStore() {
        //User click on Details Button
        homePage.clickOnDetailsButton();
        //User Click on AssertTitle
        newOnlineStore.AssertTitle();
        //Assert for URL
        newOnlineStore.AssertForURL();
        //Verify New Title
        newOnlineStore.VerifyNewTitle();
        //Assert For ExpectedSuccessful Message
        newOnlineStore.AssertForExpectedSuccessfulMessage();

    }
    @Test (priority = 9)
    public void CurrencySelect(){
        //Currency Select
      // homePage.CurrencySelect();
        homePage.Selectcurrency();
       homePage.Assertcurrency();


    }
    @Test (priority = 10)
    public void IframeTopic(){
        //SwitchIFrame
        iframe.SwichIframe();
        iframe.animalName();


    }

}








