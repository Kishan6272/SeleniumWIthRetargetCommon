package Basics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {

    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        System.out.println(chromeDriver.getTitle());


//        ChromeDriver chromeDriver1=new ChromeDriver();
//        chromeDriver1.get("https://www.youtube.com");
//        System.out.println(chromeDriver.getTitle());

        chromeDriver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");

        chromeDriver.close();
        chromeDriver.close();
    }
}
