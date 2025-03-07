package Basics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        System.out.println(chromeDriver.getWindowHandle());
        chromeDriver.switchTo().newWindow(WindowType.TAB);
        Set<String> set=chromeDriver.getWindowHandles();
        System.out.println(set);
        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        set=chromeDriver.getWindowHandles();
        System.out.println(set);
        chromeDriver.close();
    }
}
