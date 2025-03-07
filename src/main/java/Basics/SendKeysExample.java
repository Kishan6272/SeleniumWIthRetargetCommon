package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysExample {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://practicesoftwaretesting.com/auth/login");

       WebElement elem= chromeDriver.findElement(By.id("email"));
       elem.sendKeys("kishanpandey6272@gmail.com");
        elem.sendKeys("kishanpandey6272@gmail.com");
          elem.sendKeys("\u0958");
          Thread.sleep(2000);
//
//        chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\DiffrentTextBoxes.html");
//
//        chromeDriver.findElement(By.id("example1")).sendKeys("kishan");
//        chromeDriver.findElement(By.id("example2")).sendKeys("kishan");

        chromeDriver.quit();
    }
}
