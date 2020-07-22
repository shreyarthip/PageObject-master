package org.example;

import org.openqa.selenium.By;

public class Computer extends Util{

    private By _deskTop = By.linkText("Desktops");

    public void userClickOnDesktop(){
        clickOnElement(_deskTop,30);
    }
}
