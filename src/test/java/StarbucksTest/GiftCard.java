package StarbucksTest;

import BaseClass.Setup;
import PageObjectsStarbuck.GiftCardPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCard extends Setup {
    GiftCardPage giftCardPage;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://www.starbucks.com/gift");
      giftCardPage  = PageFactory.initElements(driver,GiftCardPage.class);
    }
    @Test
    void EasterTest(){
      Assert.assertTrue(giftCardPage.setEaster());
    }

    @AfterMethod
    void QuitBrowser(){
        quitbrowser();
    }
}
