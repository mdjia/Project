package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Setup{
    public void setMoveMouse(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }
    public void DoubleClick(WebDriver dr,WebElement element){
        Actions actions = new Actions(dr);
        actions.doubleClick(element).perform();
    }
    public void SendKey(WebDriver dr,WebElement element){
        Actions actions = new Actions(dr);
        actions.sendKeys(element).perform();
    }
}
