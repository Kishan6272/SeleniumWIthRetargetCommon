package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class FindElementExample {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver chromeDriver = new ChromeDriver();
        Thread.sleep(3000);
        chromeDriver.get("https://practicesoftwaretesting.com/auth/login");
       // chromeDriver.manage().window().maximize();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement elem= chromeDriver.findElement(By.id("email"));
        List<WebElement> allInputElements=chromeDriver.findElements(By.tagName("input"));
      boolean isPresent= elem.isDisplayed();
        System.out.println(new Date());
       // chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(allInputElements.size());

       chromeDriver.quit();
    }
}

