package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\GetTextExample.html");

        System.out.println(  driver.findElement(By.tagName("h1")).getText());
        driver.quit();
    }
}
