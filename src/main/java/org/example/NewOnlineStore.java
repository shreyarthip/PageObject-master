package org.example;

import jdk.Exported;
import org.openqa.selenium.By;
import org.testng.Assert;

public class NewOnlineStore extends Util {

    private By _Title = By.xpath("//input[@class=\"enter-comment-title\"]");
    private By _comment = By.xpath("//textarea[@id='AddNewComment_CommentText']");
    private By _NewComment = By.xpath("//input[@name=\"add-comment\"]");
    String  ExpectedSuccessfulMessage = ("News comment is successfully added");
    String ExpectedTitle = "Test";



    public void AssertForURL() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/new-online-store-is-open");

    }
    public void AssertForExpectedSuccessfulMessage() {
        String actual = getTextFromPage(By.xpath("//div[@class=\"result\"]"), 40);
        Assert.assertEquals(actual, ExpectedSuccessfulMessage);
    }

     public void AssertTitle(){
      String actualTitle = getTextFromElement(By.xpath("div[@class=\"comments\"]/div[7]/div[2]/div[2] "));
         Assert.assertEquals(actualTitle, ExpectedTitle);
     }
    public void VerifyNewTitle(){
      TypeText(_Title,"Test");
      TypeText(_comment,"Jai Swaminarayan");
      clickOnElement(_NewComment,40);

    }

    }



