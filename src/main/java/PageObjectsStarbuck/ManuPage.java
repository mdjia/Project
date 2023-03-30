package PageObjectsStarbuck;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ManuPage {
  @FindBy(xpath ="//section[@id=\"drinks\"]/div/div/div/div/div")
    WebElement drinks;
  @FindBy(xpath = "//div[@class=\"px3 md-pl0 pt5 lg-pt6 baseMenu___1AWcA\"]/section[2]/div/div/div/a/span")
 List< WebElement> food;
  @FindBy(css = "data-e2e=\"Lunch\"")
  WebElement lunch;
  @FindBy(css = "[data-e2e=\"Avocado Spread\"]")
  WebElement avocado;
  @FindBy(xpath = "//section[@id=\"drinks\"]/div/div[3]/div/div/div/div[1]")
  WebElement hotTeas;

  @FindBy(xpath = "//section[@id=\"chai-teas\"]/div/div[2]/div/div[2]/span/span")
  WebElement chaiTea;
  public boolean setDrinks(){
     return drinks.isEnabled();
  }
  public ArrayList<String> setFood(){
    ArrayList<String>actual = new ArrayList<>();
    for(WebElement each : food){
     actual.add(each.getText());
    }
    return actual;
  }
  public boolean setlunch(){
      return lunch.isDisplayed();
  }
  public void setLunchTwo(){
      lunch.click();
  }
  public boolean setAvocado(){
   return avocado.isEnabled();
  }
  public boolean setHotTeas(){
      return hotTeas.isDisplayed();
  }
  public void setHotTeasTwo(){
      hotTeas.click();
  }
  public boolean setChaitea(){
      return chaiTea.isDisplayed();
  }
}
