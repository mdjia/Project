package HomesiteInsuranceTest;

import BaseClass.Setup;
import PageObjectHomeinsurance.HomeSitinsurance;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Homeinsurance extends Setup {
    HomeSitinsurance homeSitinsurance;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://go.homesite.com");
        homeSitinsurance = PageFactory.initElements(driver,HomeSitinsurance.class);
    }
    @Test(priority = 0)
    void logoTest(){
        Assert.assertTrue(homeSitinsurance.setlogo());
    }
    @Test(priority = 1)
    void FacebookTest(){
        homeSitinsurance.setFacebook();
        windowHandle(driver);
        Timeout(driver);
        Assert.assertTrue(homeSitinsurance.setfacebooklogo());
    }
    @Test(priority = 2)
    void twitterTest(){
        homeSitinsurance.setTwitter();
        windowHandle(driver);
        Timeout(driver);
        Assert.assertTrue(homeSitinsurance.settwitterlogo());
    }
    @Test(priority = 3)
    void defautlPageTest(){
        homeSitinsurance.setFacebook();
        homeWindow(driver);
        Timeout(driver);
       Assert.assertTrue(homeSitinsurance.setlogo());
    }
    @Test(priority = 4)
    void loginButtonTest(){
        Assert.assertTrue(homeSitinsurance.setLoginButton());
    }
    @Test
    void HeaderTest(){
      int ActualSize = homeSitinsurance.setHeaderElements().size();
      Assert.assertEquals(ActualSize,6);
    }
    @Test
    void HeaderTestTwo(){
      ArrayList<String> actual = homeSitinsurance.setHeaderElements();
      Assert.assertTrue(actual.contains("Products"));
    }
    @Test
    void loginFunctionTest(){
        homeSitinsurance.setLoginButtonTwo();
        homeSitinsurance.setPersonalInsurance();
        Assert.assertTrue(homeSitinsurance.sethomesitelogo());
    }

    @AfterMethod
    void QuitBrowser(){
        quitbrowser();
    }
}
