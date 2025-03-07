package after37;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExplicitWait {


   public  static  String oldTitle="";
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\TitleChange.html");


         oldTitle = driver.getTitle();
       // System.out.println(oldTitle);


        driver.findElement(By.xpath("//button[text()='Change Title']")).click();

//        System.out.println(LocalDateTime.now());
//        boolean flag =true;
//
//        while (flag)
//        {
//             String newTitle= driver.getTitle();
//             if(!oldTitle.equalsIgnoreCase(newTitle))
//             {
//                 flag=false;
//             }
//        }
//        System.out.println(LocalDateTime.now());
//
//        System.out.println(driver.getTitle());


        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.pollingEvery(Duration.ofSeconds(1));

      //  webDriverWait.until(new WaitFOrTitle());

        System.out.println( LocalDateTime.now());
        webDriverWait.until(cdriver ->
        {    System.out.println( LocalDateTime.now());
           String currentTitle= cdriver.getTitle();
           return !currentTitle.equalsIgnoreCase(ExplicitWait.oldTitle);
        });
        System.out.println( LocalDateTime.now());

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
