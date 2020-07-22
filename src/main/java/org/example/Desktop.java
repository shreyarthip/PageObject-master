package org.example;

import org.openqa.selenium.By;

public class Desktop extends Util{
    private By _digitalStorm = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    private By _emailFriend = By.xpath("//input[@value=\"Email a friend\"]");
    private By _typeFriendEmail = By.xpath("//input[@id=\"FriendEmail\"]");
    private By _typeYourEmail = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _typeText = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By _sendEmail = By.xpath("//input[@name=\"send-email\"]");


    public void ClickOnEmailFriend(){
        clickOnElement(_digitalStorm, 20);
        clickOnElement(_emailFriend,20);
        TypeText(_typeFriendEmail,"abcdef@gmail.net");
       // TypeText(_typeYourEmail,"nitucp999+\"+timestamp()+\"@gmail.com");
        TypeText(_typeText,"You are being invited");
        clickOnElement(_sendEmail,30);



    }


    
}
