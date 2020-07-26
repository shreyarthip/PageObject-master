import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.BrowserManager;
import org.example.Util;

public class Hooks extends Util {
    BrowserManager browserManager = new BrowserManager();
    @Before
    public  void SetBrowser(){

        browserManager.setBrowser();
    }
    @After
    public void CloseBrowser(){

    }
}
