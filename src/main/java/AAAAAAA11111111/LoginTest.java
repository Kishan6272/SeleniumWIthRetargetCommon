package AAAAAAA11111111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {

    public WebDriver driver;

    @Test
    public void test01(String userName,String Password)
    {
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys(userName);

        driver.findElement(By.name("password")).sendKeys(Password);

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
