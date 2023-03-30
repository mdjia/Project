package StarbucksTest;

import BaseClass.Setup;
import PageObjectsStarbuck.CreatAccountPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreatAccount extends Setup {
    CreatAccountPage creatAccountPage;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://www.starbucks.com/account/create");
        creatAccountPage = PageFactory.initElements(driver, CreatAccountPage.class);
    }
    @Test
    void createaccountTest(){
        creatAccountPage.Personalinformation("nom","an","nomail@gmail.com","12345678No$");
        creatAccountPage.setAgreeTick();
        creatAccountPage.setCreateButton();
        Assert.assertTrue(creatAccountPage.setStartorder());
    }
   @AfterMethod
    void QuitBrowser(){
        quitbrowser();
    }
}
