package ABc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandles {

    public WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
      driver=new ChromeDriver();
      driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
      driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");


        JavascriptExecutor js = (JavascriptExecutor) driver;

        // --- Scrolling Examples ---

        // 1. Scroll down by a specific pixel amount (e.g., 500 pixels)
        System.out.println("Scrolling down by 500 pixels...");
        js.executeScript("window.scrollBy(0, 300)");

     // driver.findElement(By.id("newWindowBtn")).click();

        driver.findElement(By.id("newTabBtn")).click();


      String parentWindowHandle= driver.getWindowHandle();
        System.out.println("pd"+parentWindowHandle);

     Set<String> allWindowHandles= driver.getWindowHandles();



     for(String handle: allWindowHandles)
     {
         if(!handle.equals(parentWindowHandle)) {
             driver.switchTo().window(handle);
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            // driver.findElement(By.id("firstName")).sendKeys("kishan kumar Pandey");
             driver.findElement(By.id("alertBox")).click();
             driver.switchTo().alert().accept();
             driver.close();
         }
         System.out.println("all"+handle);
     }


     driver.switchTo().window(parentWindowHandle);

     driver.findElement(By.id("name")).sendKeys("Kishan Kumar Pandrejh");


     Thread.sleep(2000);




    }


    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
