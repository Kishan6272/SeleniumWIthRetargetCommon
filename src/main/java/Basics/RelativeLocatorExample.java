package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class RelativeLocatorExample {


    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();

        driver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\RelativeLocators3.html");


//        driver.findElement(RelativeLocator.with(By.xpath("//input[@type='text']"))
//                .toRightOf(By.xpath("//label[text()='Select your birthday:']")))
//                .click();
//        Thread.sleep(2000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//       // Thread.sleep(2000);
//
//
//        driver.findElement(RelativeLocator.with(By.tagName("label"))
//                .toLeftOf(By.id("meeting"))).click();
//        Thread.sleep(2000);

//      List<WebElement> allLabel=  driver.findElements(RelativeLocator.with(By.tagName("label"))
//                .below(By.tagName("h1")));
//
//
//      allLabel.forEach(ele-> System.out.println(ele.getText()));


       String price= driver.findElement(RelativeLocator.with(By.xpath("//h2[text()='Book Title 1']/..//p/strong[text()='Price:']/.."))
                .below(By.xpath("//h2[text()='Book Title 1']"))).getText();
        System.out.println(price);

        driver.quit();
    }
}
