package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsyncJS_Executor {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.blogger.com/about/?bpli=1");

        JavascriptExecutor jse= (JavascriptExecutor)driver;

        jse.executeAsyncScript("window.alert();");

        Thread.sleep(2000);
        driver.quit();
    }
}
