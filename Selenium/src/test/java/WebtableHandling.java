import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;

public class WebtableHandling extends BaseClass {

    @Test
    public void webtable(){
        initialiseDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        WebElement countries=findElementWithXpath("//*[@id='countries']");

        List<WebElement> rows = countries.findElements(By.tagName("tr"));
        System.out.println("number of rows = "+ rows.size());
        for (WebElement row:rows){
                // Get all columns in the row
                List<WebElement> cols = row.findElements(By.tagName("td"));
                for (WebElement col : cols) {
                    // Print text of each column
                    System.out.println(col.getText());
                }
        }

    }
}
