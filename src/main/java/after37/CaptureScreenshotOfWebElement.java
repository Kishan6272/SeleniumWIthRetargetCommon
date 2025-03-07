package after37;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class CaptureScreenshotOfWebElement {


    public static void main(String[] args) throws IOException {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://practicesoftwaretesting.com/");

        WebElement elemS=driver.findElement(By.xpath("//a[@title='Practice Software Testing - Toolshop']"));

        File Logo=elemS.getScreenshotAs(OutputType.FILE);


        FileHandler.copy(Logo,new File("src/main/resources/Screenshit/chrome5.png"));

      //  driver.quit();

      //  Action action=new Action(driver) ;



    }
}
