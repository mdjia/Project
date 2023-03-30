package PageObjectHomeinsurance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalLogin {
    @FindBy(css = "[placeholder=\"username@email.com\"]")
    WebElement username;
    @FindBy(css = "[placeholder=\"password\"]")
    WebElement password;
    @FindBy(id = "customerLogInBtn")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class=\"card one-one\"]/div[3]")
    WebElement Nomatch;
    @FindBy(css = "[class=\"phoneNumber\"]")
    WebElement callButton;
    @FindBy(xpath = "//div[@class=\"customerServiceSection customerServiceHours\"]/div[1]")
    WebElement numberDisplay;
    @FindBy(css = "[class=\"btnO createAccount\"]")
    WebElement createAccount;
    @FindBy(xpath = "//div[@class=\"form\"]/div[8]")
    WebElement troublelogging;
    public void setLoginFunction(String userName,String Password){
        username.sendKeys(userName);
        password.sendKeys(Password);
    }
    public void setLoginButton(){
        loginButton.click();
    }

    public boolean setUserName(){
        return username.isEnabled();
    }
    public boolean setPassword(){
        return password.isEnabled();
    }
    public boolean setNomatch(){
       return Nomatch.isDisplayed();
    }
    public boolean setCallButton(){
      return   callButton.isDisplayed();
    }
    public void setCallButtonTwo(){
        callButton.click();
    }
    public boolean setNumberDiisplay(){
       return callButton.isDisplayed();
    }
    public boolean setCreateAccount(){
        return createAccount.isDisplayed();
    }
    public boolean setTroublelogging(){
       return troublelogging.isDisplayed();
    }
    public boolean setTroubleloggingTwo(){
        return troublelogging.isEnabled();
    }
}
