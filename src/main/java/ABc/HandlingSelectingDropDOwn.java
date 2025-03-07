package ABc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingSelectingDropDOwn {


    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();

      //  driver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\Dropdowns.html");


        driver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\FaultySelectDropdowm.html");
        WebElement element=driver.findElement(By.tagName("select"));

        Select select=new Select(element);

        select.selectByValue("option2");
//
//
        Thread.sleep(3000);
  //      select.deselectByValue("option2");
        Thread.sleep(3000);
//
//        select.selectByVisibleText("Option 3");
//
//        Thread.sleep(3);
//
//        select.selectByIndex(4);
//
//        Thread.sleep(3);

   //     select.selectByContainsVisibleText("Opt");


//        List<WebElement> options = select.getOptions();
//
//        options.forEach (   webElement -> System.out.println( webElement.getText()));


        driver.quit();
    }
}
