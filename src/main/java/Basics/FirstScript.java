package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstScript {

    public static void main(String[] args) throws InterruptedException {

      //  ChromeOptions chromeOptions=new ChromeOptions();
       // chromeOptions.setBinary("D:\\SoftwareTetingToolsandFiles\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver chromeDriver=new ChromeDriver();
        Thread.sleep(3000);
        chromeDriver.get("https://www.google.com/maps");
        chromeDriver.manage().window().maximize();
        System.out.println(  chromeDriver.getTitle());
        chromeDriver.quit();

    }

}
