package PageObjectsStarbuck;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccountPage {
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "emailAddress")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//form[@method=\"post\"]/div/div/div[1]/label/span/span/span")
    WebElement AgreeTick;
    @FindBy(css = "[data-e2e=\"createButton\"]")
    WebElement createButton;
    @FindBy(css = "[class=\"sb-frap sb-frap--centerSVG\"]")
    WebElement startorder;
    public void Personalinformation(String firstname,String lastname,String emailid,String pass){
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        email.sendKeys(emailid);
        password.sendKeys(pass);
    }
    public void setAgreeTick(){
        AgreeTick.click();
    }
    public void setCreateButton(){
        createButton.click();
    }
    public boolean setStartorder(){
        return startorder.isDisplayed();
    }
}
