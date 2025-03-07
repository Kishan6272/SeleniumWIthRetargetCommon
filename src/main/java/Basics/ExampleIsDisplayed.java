package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleIsDisplayed {

    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        //chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\DisplayExample.html");



        chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\HideElement.html");

        WebElement elem1=chromeDriver.findElement(By.className("btn1"));
        System.out.println(elem1.isDisplayed());
        elem1.click();
        WebElement elem=chromeDriver.findElement(By.className("btn2"));
        System.out.println(elem.isDisplayed());


      //  System.out.println(elem.isDisplayed());
       // elem.click();

        chromeDriver.quit();
    }
}
