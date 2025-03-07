package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
       // Thread.sleep(3000);
        chromeDriver.get("https://google.com");
        Thread.sleep(15000);
        chromeDriver.quit();
    }
}
