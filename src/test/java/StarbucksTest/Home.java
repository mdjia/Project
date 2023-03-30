package StarbucksTest;

import BaseClass.Setup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class Home extends Setup {
    PageObjectsStarbuck.HomePage homePage;
    @BeforeMethod
     void RunDriver(){
       SetDriver("https://starbucks.com");
        homePage = PageFactory.initElements(driver, PageObjectsStarbuck.HomePage.class);
    }
    @Test(priority = 0)
   public void logoTest(){
      Assert.assertTrue(homePage.logoDispaly());
    }
    @Test(priority = 1)
   public void FindstoreTest(){
        homePage.setFindStore();
        Assert.assertEquals(homePage.setFilterButton(),"Filter");
    }
    @Test(priority = 3,groups = "screenShort")
   public void scrollDownTest(){
     ScrollDown(driver,"window.scroll(0,7000)");
     Assert.assertEquals(homePage.setPrivacyNotice(),"Privacy Notice");
    }
    @Test(priority = 5)
   public void AboutusTest(){
        ArrayList<String>expect = new ArrayList<>();
        expect.add("Our Company");
        expect.add("Our Coffee");
        expect.add("Stories and News");
        expect.add("Starbucks Archive");
        expect.add("Investor Relations");
        expect.add("Customer Service");
        Assert.assertEquals(homePage.setAboutus(),expect);
    }
    @Test(priority = 6)
     void AboutusTestTwo(){
        Assert.assertTrue(homePage.setAboutusTwo());
    }
    @Test(priority = 7)
    void careersTest(){
        Assert.assertTrue(homePage.setcareers());
    }
    @Test(priority = 4,dependsOnGroups = "screenShort")
   void ScreenshortTest () throws IOException {
        ScrollDown(driver,"window.scroll(0,7000)");
        ScreenShort(driver,"/Users/nomaan/Desktop/i/starbucks.jpg");
    }
    @Test(priority = 8)
    void cookiesTest(){
      Assert.assertTrue(homePage.setCookies());
    }
    @Test
    void cookiesTestTwo(){
        homePage.setAgreeButton();
    }

   @AfterMethod
    void Quitbrowser(){
         quitbrowser();
    }
}
