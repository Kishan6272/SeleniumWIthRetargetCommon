package ABc;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitExample {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();

       // driver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\TitleLoading.html");
//
     //   WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        webDriverWait.until(ExpectedConditions.titleIs("Completed"));

//        FluentWait<ChromeDriver> fluentWait=new FluentWait<>(driver);
//        fluentWait.withTimeout(Duration.ofSeconds(15));
//
//
//
//        fluentWait.until(ExpectedConditions.titleIs("Completed"));


        ApiCalls apiCalls=new ApiCalls();

        FluentWait<ApiCalls> fluentWait=new FluentWait<>(apiCalls);

        fluentWait.withTimeout(Duration.ofSeconds(15));

        fluentWait.until(apiCalls1 ->{

            System.out.println("strted");
              return apiCalls1.getToolName().jsonPath()
                .getString("tool").equalsIgnoreCase("Selenium");

        });






        System.out.println(driver.getTitle());


        driver.quit();
    }
}
