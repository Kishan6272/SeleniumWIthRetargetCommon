package After59;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class YatraCom {


    public static WebDriver driver;


    @Test
    public void test01()
    {
        driver=new ChromeDriver();

        driver.get("https://www.yatra.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.xpath("//p[contains(text(),'Departure From')]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//label[contains(text(),'Departure From')]/..//input")).sendKeys("Banga");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//div[text()='Bangalore, (BLR)']/..")).click();

        driver.findElements(By.xpath("//p[text()='Departure From']/../p[position()>1]"))
                .forEach(ele-> System.out.println(ele.getText()));


    }





    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
