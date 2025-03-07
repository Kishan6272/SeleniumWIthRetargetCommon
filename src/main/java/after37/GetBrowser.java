package after37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetBrowser {


    public ChromeDriver getChrome()
    {
        ChromeDriver chromeDriver=new ChromeDriver();
        return chromeDriver;
    }

    public EdgeDriver getEdgeDriver()
    {
        EdgeDriver edgeDriver=new EdgeDriver();
        return edgeDriver;
    }

    public FirefoxDriver getFireFoxDriver()
    {
        FirefoxDriver firefoxDriver=new FirefoxDriver();
        return firefoxDriver;
    }


    public RemoteWebDriver getBrowser(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            ChromeDriver chromeDriver=new ChromeDriver();
            return chromeDriver;
        }

        else if(browserName.equalsIgnoreCase("edge"))
        {
            EdgeDriver edgeDriver=new EdgeDriver();
            return  edgeDriver;
        }
        else
        {
          FirefoxDriver firefoxDriver=new FirefoxDriver();
                  return firefoxDriver;
        }

    }
}
