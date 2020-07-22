package org.example;

import org.openqa.selenium.By;

public class BookCart extends Util {


    private By _FirstPrize = By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/div[3]/div[2]/input[1]");
    private By _Bradbury = By.linkText("Fahrenheit 451 by Ray Bradbury");
    private By _addToCart = By.xpath("//input[@id=\"add-to-cart-button-37\"]");
    private By _ShoppingCart = By.linkText("Shopping cart");

    public void userEnterItemAddToCart() {
        //click on FirstPrize Pies
        clickOnElement(_FirstPrize, 20);
        //click on Fahrenheit 451 by Ray Bradbury
        clickOnElement(_Bradbury, 20);
        //click on Add to cart
        clickOnElement(_addToCart, 20);
        //click on ShoppingCart
        clickOnElement(_ShoppingCart, 20);
    }
}