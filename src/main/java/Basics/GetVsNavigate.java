package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class GetVsNavigate {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        //Thread.sleep(3000);
       // chromeDriver.get("https://www.google.com");


        WebDriver.Navigation navigation=chromeDriver.navigate();
        navigation.to("https://www.google.com");
        //Thread.sleep(3000);
        chromeDriver.navigate().to("https://www.Cnn.com");
        chromeDriver.navigate().back();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.navigate().forward();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }
}
