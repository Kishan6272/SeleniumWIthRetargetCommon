package After59;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectTagDropdown {

    public static WebDriver driver;

    @Test
    public void firstTets() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
       // WebDriverWait wait=new WebDriverWait();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//li[@class=\"style__LocaleSettingsSelector-sc-1sh96gm-0 eZlSok\"]")).click();
        driver.findElement(By.xpath("//div[@data-testid=\"country-dropdown\"]")).click();
        driver.findElement(By.xpath("//p[@data-testid=\"IN-country\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String selectedInput=driver.findElement(By.xpath("//span[contains(text(),'India')  and @ class=\"styles__CountryName-sc-e66som-24 dklIDi\"]")).getText();

        System.out.println(selectedInput);


    }


    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
