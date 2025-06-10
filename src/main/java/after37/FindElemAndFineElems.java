package after37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElemAndFineElems {

   public  WebDriver driver;

    @Test
    public void firstMeth() {
         driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");


        WebElement elem = driver.findElement(By.tagName("a"));

        List<WebElement> elems= driver.findElements(By.tagName("a"));


        System.out.println(elems.size());

        for(WebElement elem1: elems)
        {
            System.out.println(elem1.getText());
        }



    }

    @AfterMethod
    public void tesrDown()
    {
        driver.quit();
    }

}

