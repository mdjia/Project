package StarbucksTest;

import BaseClass.Setup;
import com.beust.ah.A;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Manu extends Setup {
    PageObjectsStarbuck.ManuPage manuPage;
    @BeforeMethod
    void ReadyDriver(){
        SetDriver("https://www.starbucks.com/menu");
       manuPage  = PageFactory.initElements(driver, PageObjectsStarbuck.ManuPage.class);
    }
  @Test
    void DrinkTest(){
      Assert.assertTrue(manuPage.setDrinks());
  }
  @Test
    void FoodTest(){
    int ActualNumber = manuPage.setFood().size();
    Assert.assertEquals(ActualNumber,5);
  }
  @Test
    void lunchTest(){
       Assert.assertTrue( manuPage.setlunch());
  }
  @Test(enabled = false)
  void AvocadoTest(){
        manuPage.setLunchTwo();
        Assert.assertTrue(manuPage.setAvocado());
  }
  @Test
  void HotTeasTest(){
      Assert.assertTrue(manuPage.setHotTeas());
  }
  @Test(enabled = false)
  void ChaiTeaTest(){
   manuPage.setLunchTwo();
      Assert.assertTrue(manuPage.setChaitea());
  }
  @AfterMethod
  void QuitBrowser(){
        quitbrowser();
  }
}
