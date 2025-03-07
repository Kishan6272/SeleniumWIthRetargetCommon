package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Date;

public class ClickExample {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();

//        chromeDriver.get("https://practicesoftwaretesting.com/");
//
//       WebElement elem1= chromeDriver.findElement(By.linkText("Sign in"));
//
//       elem1.click();


        chromeDriver.get("https://edition.cnn.com/");

        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement elem2= chromeDriver.findElement(By.partialLinkText("Terms of"));
        System.out.println(new Date());
        elem2.click();
        System.out.println(new Date());
        //Sign in


        chromeDriver.quit();
    }
}
