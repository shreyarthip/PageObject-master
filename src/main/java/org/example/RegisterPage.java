package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util {
    private By _firstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _dateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _dateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _dateOfBirthyear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _emailField = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _password = By.xpath("//input[@name=\"Password\"]");
    private By _confirmpassword = By.xpath("//input[@name=\"ConfirmPassword\"]");
    private By _registerSubmitButton = By.id("register-button");


    public void userEnterRegistrationDetails() {
        TypeText(_firstName, "Shreyarthi");
        TypeText(_lastName,"Patel");
        selectFromDropDownByIndex(_dateOfBirthday,"3");
        selectFromDropDownByVisibleText(_dateOfBirthMonth,"January");
        selectFromDropDownByValue(_dateOfBirthyear,"1912");
        TypeText(_emailField,"shreyarthi+" + timestamp() + "@gmail.com");
        TypeText(_CompanyName,"ABC LTD");
        TypeText(_password,"My@password");
        TypeText(_confirmpassword,"My@password");
    }
     public void userClickOnRegisterSubmitButton() {
         clickOnElement(_registerSubmitButton, 30);

     }


    }

