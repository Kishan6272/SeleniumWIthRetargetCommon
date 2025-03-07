package Basics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindow {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.youtube.com");
        String parentHandle=chromeDriver.getWindowHandle();
        System.out.println(chromeDriver.getTitle());


         chromeDriver.switchTo().newWindow(WindowType.TAB);
        chromeDriver.get("https://www.Cnn.com");
        System.out.println(chromeDriver.getTitle());
        String childHandle=chromeDriver.getWindowHandle();


        chromeDriver.switchTo().newWindow(WindowType.TAB);
        chromeDriver.get("https://www.google.com");
        System.out.println(chromeDriver.getTitle());

        Set<String> allHandles=chromeDriver.getWindowHandles();

        //String ph=allHandles.stream().findFirst().get();
        //chromeDriver.switchTo().window(ph);

       for(String handles: allHandles)
       {

       }

        Thread.sleep(3000);
        chromeDriver.quit();

    }
}
