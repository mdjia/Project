package PageObjectEbay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
  @FindBy(css = "[aria-label=\"Select a category for search\"]")
   public WebElement dropDown;
  @FindBy(id = "gh-btn")
  WebElement seacrhButton;
  @FindBy(xpath = "//nav[@aria-labelledby=\"s0-15-6-0-1[0]-1-0-1[0]-breadcrumbs-heading\"]/ul/li[3]/a")
  WebElement crafts;
  @FindBy(xpath = "//footer[@class=\"gh-w\"]/div[3]/table/tbody/tr[2]/td[1]")
  WebElement copyRight;
  @FindBy(name = "_nkw")
  WebElement searchBox;
  @FindBy(xpath = "//ul[@id=\"ui-id-1\"]/li/a/b")
  List<WebElement>searchResult;
  @FindBy(css = "[class=\"srp-controls__count-heading\"]")
  WebElement mobileResults;
  public void setSeacrhButton (){
    seacrhButton.click();
  }
  public boolean setCrafts(){
    return crafts.isDisplayed();
  }
  public String setCopyRight(){
    return copyRight.getText();
  }
  public boolean setCopyRightTwo(){
   return copyRight.isDisplayed();
  }
  public void setSeachBox (){
    searchBox.sendKeys("mobile");
  }
  public void setearchResult(){
    for(WebElement each : searchResult){
     if(each.getText().equals("mobile home"))
       each.click();
       break;
    }
  }
  public boolean setMobileResults(){
    return mobileResults.isDisplayed();
  }
}
