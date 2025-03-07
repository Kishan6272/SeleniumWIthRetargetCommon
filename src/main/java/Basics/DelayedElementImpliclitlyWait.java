package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class DelayedElementImpliclitlyWait {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        //Thread.sleep(3000);
        chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\Basics\\DelayElement.html");
//
//        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        System.out.println(new Date());
//        WebElement textbox=chromeDriver.findElement(By.tagName("input"));
//        System.out.println(textbox.isDisplayed());
//        System.out.println(new Date());

       // chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\DisplayedIntervalElement.html");
        System.out.println(new Date());
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        List<WebElement> allBtn=chromeDriver.findElements(By.tagName("Button"));
        System.out.println(allBtn.size());

        System.out.println(new Date());












        chromeDriver.quit();
    }
}
