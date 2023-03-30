package StarbucksTest;

import BaseClass.Setup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Signin extends Setup {
    PageObjectsStarbuck.SigninPage signinPage;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://www.starbucks.com/account/signin?ReturnUrl=%2F");
        signinPage = PageFactory.initElements(driver, PageObjectsStarbuck.SigninPage.class);
    }
        @Test
   void SigninTest(){
       signinPage.setSignIn("batch@gmail.com","1234567");
     Assert.assertTrue(signinPage.UnsuccessfulDisplay());
   }
   @Test
   void FotterTest(){
        Assert.assertTrue(signinPage.setSocialimpact());
   }
   @Test
   void forgotUsernameTest(){
        signinPage.setForgotUsername();
        Timeout(driver);
        Assert.assertTrue(signinPage.setinsteduserName());
   }
    @Test
    void ScrollTest() throws IOException {
        ScrollDown(driver,"window.scroll(0,1000)");
        Assert.assertTrue(signinPage.setyoutube());
    }
   @AfterMethod
   void Quitbrowser(){
        quitbrowser();
   }
}


