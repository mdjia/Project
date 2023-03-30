package BaseClass;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class Setup {
  public WebDriver driver;
  public void SetDriver(String url){
        System.setProperty("Webdriver.chrome.driver","src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(url);
    }
   public void quitbrowser(){                          //Quit Browser.
      driver.quit();
    }

   public void DropDown(WebElement element,String stringValu){        //Drop Down.
        Select select = new Select(element);
        select.selectByVisibleText(stringValu);
    }
   public void ScrollDown(WebDriver dr,String script){             //Scroll Down.
        JavascriptExecutor js =((JavascriptExecutor)dr);
        js.executeScript(script);
    }
    public void windowHandle(WebDriver dr){                       //Window Handle.
      String home = dr.getWindowHandle();
     Set<String>windows = dr.getWindowHandles();
     for(String single : windows){
         if(single != home)
         dr.switchTo().window(single);
     }
  }
  public void homeWindow(WebDriver dr){                           //Home Window.
     String home = dr.getWindowHandle();
     Set<String>windows = dr.getWindowHandles();
     for(String single : windows){
         if(single != home)
             dr.switchTo().window(home);
     }
  }
  public void ScreenShort(WebDriver dr,String path) throws IOException {          //Screen Short.
     File file = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
      Files.copy(file,new File(path));
  }
  public void Timeout(WebDriver dr){                                     //Synchronization.
      dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  public void Iframe(WebDriver dr,String id){                          //Iframe.
      dr.switchTo().frame(id);
  }
  public void Alert(WebDriver dr){                                 //Alert .
      dr.switchTo().alert().accept();
  }
}
