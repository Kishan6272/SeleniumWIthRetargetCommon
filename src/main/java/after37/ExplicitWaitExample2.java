package after37;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample2 {

    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("D:\\SpringBootYoutube\\UserServiceKishanScalerServiceDurgesh\\JAVASELENIUMRETARGET\\SeleniumWIthRetargetCommon\\src\\main\\java\\HtmlPages\\TitleLoading.html");


        WebDriverWait webDriverWait=new WebDriverWait(chromeDriver, Duration.ofSeconds(15));


        webDriverWait.until(ExpectedConditions.and(ExpectedConditions.titleIs("Completed"),
                ExpectedConditions.textToBe(By.id("titleDisplay"),"Completed")));



        chromeDriver.quit();
    }
}
