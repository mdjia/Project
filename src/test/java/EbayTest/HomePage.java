package EbayTest;

import BaseClass.Setup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage extends Setup {
    PageObjectEbay.HomePage homePage;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://ebay.com");
    homePage = PageFactory.initElements(driver, PageObjectEbay.HomePage.class);
    }
    @Test(priority = 0)
    void DropDownTest(){
           DropDown(homePage.dropDown,"Crafts");
           homePage.setSeacrhButton();
           Assert.assertTrue(homePage.setCrafts());
    }
    @Test(priority = 1)
    void CopyRightTest(){
        Assert.assertEquals(homePage.setCopyRight(),"Copyright © 1995-2023 eBay Inc. All Rights Reserved. Accessibility, User Agreement, Privacy, Payments Terms of Use, Cookies, Your Privacy Choices and AdChoice");
    }
    @Test (enabled = false)
    void SearchBoxTest(){
      homePage.setSeachBox();
      Timeout(driver);
      homePage.setearchResult();
      Assert.assertTrue(homePage.setMobileResults());
    }
    @Test(priority = 2)
    void CopyRightTestTwo(){
        Assert.assertTrue(homePage.setCopyRightTwo());
    }
     @AfterMethod
    void QuitBrowser(){
        quitbrowser();
    }
}
