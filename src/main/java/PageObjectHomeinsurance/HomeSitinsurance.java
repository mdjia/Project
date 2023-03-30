package PageObjectHomeinsurance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomeSitinsurance {
    @FindBy(css = "[alt=\"homesite-logo\"]")
    WebElement logo;
    @FindBy(css = "[title=\"Facebook\"]")
    WebElement facebook;
    @FindBy(css = "[class=\"x6s0dn4 x78zum5 x1iyjqo2 x1n2onr6\"]")
    WebElement facebooklogo;
    @FindBy(css = "[title=\"Twitter\"]")
    WebElement twitter;
    @FindBy(css = "[class=\"css-1dbjc4n r-dnmrzs r-1vvnge1\"]")
    WebElement twitterlogo;
    @FindBy(css = "[aria-label=\"logo\"]")
    WebElement homsiteLogo;
    @FindBy(id = "img")
    WebElement loginButton;
    @FindBy(xpath = "//div[@id=\"divbio\"]/ul/li[1]/a")
    WebElement personalInsurance;
    @FindBy(xpath = "//ul[@class=\"nav navbar-nav navbar-right\"]/li/a")
   List<WebElement> headerElements ;
    public boolean setlogo(){
      return   logo.isDisplayed();
    }
   public void setFacebook(){
        facebook.click();
   }
   public boolean setfacebooklogo(){
      return   facebooklogo.isDisplayed();
   }
   public void setTwitter(){
        twitter.click();
   }
   public boolean settwitterlogo(){
       return twitterlogo.isDisplayed();
   }
   public boolean setLoginButton(){
      return   loginButton.isDisplayed();
   }
   public void setLoginButtonTwo(){
        loginButton.click();
   }
   public void setPersonalInsurance(){
        personalInsurance.click();
   }
   public boolean sethomesitelogo(){
       return homsiteLogo.isDisplayed();
   }
   public ArrayList<String> setHeaderElements(){
       ArrayList<String> actual = new ArrayList<>();
        for(WebElement each : headerElements){
            actual.add(each.getText());
        }
        return actual;
   }
}
