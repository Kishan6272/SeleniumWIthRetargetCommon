package ABc;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotCapture {

    public WebDriver driver;

    @Test
    public void test01() throws IOException {
        driver=new ChromeDriver();
        driver.get("https://www.ets.org/toefl.html?utm_source=google&utm_medium=cpc&utm_campaign=21823260601&utm_content=171429094960&gad_source=5&gad_campaignid=21823260601&gclid=EAIaIQobChMImJKLleX8jQMV7KRmAh33lxD6EAAYASAAEgIhl_D_BwE");


        // convert webDriver Object to web Driver Interface

        TakesScreenshot screenshot=(TakesScreenshot) driver;


        File Logo=screenshot.getScreenshotAs(OutputType.FILE);


        WebElement elementSC=driver.findElement(By.xpath("(//li[@class=\"c-mega-navigation__list-item  \"])[2]"));

        //File logo1=elementSC.getScreenshotAs(OutputType.FILE);

        //

       // copy image to destination
        FileHandler.copy(Logo,new File("src/main/resources/Screenshit/chrome9.png"));
       // driver.switchTo().frame()
        driver.switchTo().alert().accept();
    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }



}
