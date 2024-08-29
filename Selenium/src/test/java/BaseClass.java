import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;
import java.util.concurrent.*;

public class BaseClass {

 public static WebDriver driver;

public WebDriver initialiseDriver(){
    System.setProperty("webdriver.chrome.driver","src/main/java/chromedriver.exe");
    driver=new ChromeDriver();
    return driver;
}

public WebElement findElementWithXpath(String xpath){
   return driver.findElement(By.xpath(xpath));
}

    public List<WebElement> findElementsWithXpath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }

public void click(WebElement element){
    element.click();
}

@Test
public void ComplieProgram(){
    initialiseDriver().get("https://www.programiz.com/java-programming/online-compiler/");
    WebElement logo =findElementWithXpath("//*[@class=\"logo-link\"]");
    Assert.assertTrue(logo!=null&&logo.isDisplayed(),"Page not loaded");
    System.out.println("Programiz pafe loaded");
    WebElement run = findElementWithXpath("//*[@class=\"desktop-run-button run\"]");
    Assert.assertTrue(run!=null&&run.isDisplayed(),"Run button not displayed");
    click(run);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println("Run button clicked");
    WebElement output =findElementWithXpath("//*[text()='Try programiz.pro']");
    Assert.assertTrue(output!=null&&output.isDisplayed(),"Page not loaded");
    System.out.println("the out is :"+output.getText());
}
}
