package PageObjectsStarbuck;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GiftCardPage {
    @FindBy(xpath = "//div[@aria-label=\"Easter carousel\"]/div[2]/div/a/div/div[2]/div")
    List<WebElement> easter;
    public boolean setEaster(){
        for(WebElement each : easter){
            each.isDisplayed();
        }
        return true;
    }
}
