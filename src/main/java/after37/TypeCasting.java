package after37;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TypeCasting {

    public static void main(String[] args) {
       // ChromeDriver driver=new ChromeDriver();
       // driver.get("https://www.google.com");

        //driver.executeScript("");

        //driver.getScreenshotAs();

        GetBrowser getBrowser=new GetBrowser();
        RemoteWebDriver driver=getBrowser.getBrowser("chrome");

        driver.executeScript("");
        driver.getScreenshotAs(OutputType.FILE);

    }
}
