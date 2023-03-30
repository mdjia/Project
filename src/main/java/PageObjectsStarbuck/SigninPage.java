package PageObjectsStarbuck;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage {
    @FindBy (name = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "[data-e2e=\"signInButton\"]")
    WebElement signinButtoun;
    @FindBy(css = "[class=\"sb-heading text-lg text-bold text-center mb2\"]")
    WebElement unsuccessfulDispaly;
    @FindBy(xpath = "//nav[@aria-label=\"Global footer\"]/div/div[6]")
    WebElement socialimapact;
    @FindBy(css = "[class=\"tooltip___1rMd5 absolute mb2\"]")
    WebElement instedUserName;
    @FindBy(css = "[data-e2e=\"forgotUsernameLink\"]")
    WebElement forgotUsername;
    @FindBy(xpath = "//a[@aria-label=\"youtube\"]")
    WebElement youtube;

    public void setSignIn(String user,String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
         signinButtoun.click();
    }
    public boolean UnsuccessfulDisplay(){
      return   unsuccessfulDispaly.isDisplayed();
    }
    public boolean setSocialimpact(){
      return  socialimapact.isDisplayed();
    }
    public void setForgotUsername(){
        forgotUsername.click();
    }
    public boolean setinsteduserName(){
      return   instedUserName.isDisplayed();
    }
    public boolean setyoutube(){
        return youtube.isDisplayed();
    }
}
