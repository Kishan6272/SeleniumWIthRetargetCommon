package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EnableDisableExample {


    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\EnableDisable.html");

        WebElement elem=chromeDriver.findElement(By.id("enabledTextBox"));

        System.out.println(elem.isEnabled());
        WebElement elem1=chromeDriver.findElement(By.id("disabledTextBox"));

        System.out.println(elem1.isEnabled());
       // elem1.sendKeys("kishan");

        WebElement elem2=chromeDriver.findElement(By.className("disabled"));

        System.out.println(elem2.isEnabled());

        elem2.sendKeys("kishan");


        WebElement elem3=chromeDriver.findElement(By.tagName("textarea"));

        System.out.println(elem3.isEnabled());

        elem3.sendKeys("kishan");

        Thread.sleep(3000);



        chromeDriver.quit();


    }
}

