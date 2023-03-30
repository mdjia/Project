package PageObjectsStarbuck;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    @FindBy(css = "[fill=\"#fff\"]")
    WebElement logo;
    @FindBy(css = "[class=\"sb-textLink text-noUnderline text-semibold sb-findAStorePin inline-block mr6 \"]")
    WebElement findStore;
    @FindBy(css = "[data-e2e=\"filterButton\"]")
    WebElement filterButton;
    @FindBy(xpath = "//nav[@aria-label=\"Global footer\"]/ul[2]/li/a")
    WebElement privacyNotice;
    @FindBy(xpath = "//nav[@aria-label=\"Global footer\"]/div[1]/div[2]/ul/li")
    List<WebElement> AboutUs;
    @FindBy(xpath = "//nav[@aria-label=\"Global footer\"]/div/div[4]/ul/li")
   List<WebElement>careers;
    @FindBy(xpath = "//nav[@aria-label=\"Global footer\"]/ul[1]/li[2]/a")
    WebElement facebook;
    @FindBy(id ="truste-consent-content")
    WebElement cookies;
    @FindBy(css = "[id=\"truste-consent-button\"]")
    WebElement agreeButton;
    public boolean logoDispaly(){
      return   logo.isDisplayed();
    }
   public void setFindStore(){
        findStore.click();
    }
    public String setFilterButton(){
      return   filterButton.getText();
    }
   public String setPrivacyNotice(){
       return privacyNotice.getText();
   }
 public   ArrayList<String>setAboutus(){
        ArrayList<String>elements = new ArrayList<>();
        for(WebElement each : AboutUs){
           elements.add(each.getText());
        }
        return elements;
   }
  public boolean setAboutusTwo(){
        ArrayList<Boolean>elements = new ArrayList<>();
        for(WebElement each : AboutUs){
          elements.add(each.isEnabled());
        }
        return true;
    }
  public boolean setcareers(){
        ArrayList<Boolean> elements = new ArrayList<>();
        for(WebElement each : careers){
          elements.add(each.isDisplayed());
        }
        return true;
    }
    public   void setFacebook(){
        facebook.click();
    }
    public boolean setCookies(){
      return  cookies.isDisplayed();
    }
    public void setAgreeButton(){
        agreeButton.click();
    }
}
