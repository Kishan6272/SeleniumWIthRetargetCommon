package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMaxSetSizeWindow {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
       // WebDriver.Options options=chromeDriver.manage();
        //WebDriver.Window window=options.window();
        chromeDriver.manage().window().maximize();
        Thread.sleep(2000);
        Dimension dimension=new Dimension(1000,500);
        chromeDriver.manage().window().minimize();
//        Dimension dimension1=chromeDriver.manage().window().getSize();
//        System.out.println(dimension1.getHeight()+" "+dimension1.getWidth());
        chromeDriver
                .get("https://www.youtube.com/");
        chromeDriver.manage().window().setSize(dimension);
        Dimension dimension1=chromeDriver.manage().window().getSize();
        System.out.println(dimension1.getHeight()+" "+dimension1.getWidth());
        chromeDriver.close();

    }
}
