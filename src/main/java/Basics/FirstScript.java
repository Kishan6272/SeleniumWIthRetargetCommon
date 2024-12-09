package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com/maps");
        chromeDriver.quit();

    }

}
