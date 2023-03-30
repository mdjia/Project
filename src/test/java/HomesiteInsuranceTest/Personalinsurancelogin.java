package HomesiteInsuranceTest;

import BaseClass.Setup;
import PageObjectHomeinsurance.PersonalLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Personalinsurancelogin extends Setup {
    PersonalLogin personalLogin;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://www.homesite.com/OnlineServicing/Welcome.aspx?#Login");
      personalLogin  = PageFactory.initElements(driver, PersonalLogin.class);
    }
    @Test(priority = 4)
    void loginFuctionTest(){                                                               //NegativeTest
        personalLogin.setLoginFunction("nomail@gmail.com","123456");
        personalLogin.setLoginButton();
        Assert.assertTrue(personalLogin.setNomatch());
    }
    @Test(priority = 0)
    void UserNameTest(){
        Assert.assertTrue(personalLogin.setUserName());
    }
    @Test(priority = 1)
    void PasswordTest(){
        Assert.assertTrue(personalLogin.setPassword());
    }
    @Test(priority = 2)
    void CallButtonTest(){
        Assert.assertTrue(personalLogin.setCallButton());
    }
    @Test(priority = 3)
    void NumberDisplayTest(){
        personalLogin.setCallButtonTwo();
        Assert.assertTrue(personalLogin.setNumberDiisplay());
    }
    @Test(priority = 5)
    void CreateAccTest(){
        Assert.assertTrue(personalLogin.setCreateAccount());
    }
    @Test(priority = 6)
    void TroubleloggingTest(){
        Assert.assertTrue(personalLogin.setTroublelogging());
    }
    @Test(priority = 7)
    void TroublelogginTestTwo(){
        Assert.assertTrue(personalLogin.setTroubleloggingTwo());
    }
    @AfterMethod
    void QuitBrowser(){
        quitbrowser();
    }
}
