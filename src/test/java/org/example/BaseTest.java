package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util {

    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    public void SetBrowser() {
        browserManager.setBrowser();
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {

            takeScreenShot(result.getName() + timestamp());

        }
        browserManager.CloseBrowser();


    }

}
















