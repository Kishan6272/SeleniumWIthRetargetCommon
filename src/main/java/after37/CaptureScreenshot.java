package after37;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class CaptureScreenshot {

    public static void main(String[] args) throws IOException {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
//        String screenshotAs = chromeDriver.getScreenshotAs(OutputType.BASE64);
//        byte[] decode = Base64.getDecoder().decode(screenshotAs);


//        byte[] screenshotAs = chromeDriver.getScreenshotAs(OutputType.BYTES);
//
//        Files.write(Paths.get("src/main/resources/Screenshit/chrome2.png"),screenshotAs);

        File screenshotAs = chromeDriver.getScreenshotAs(OutputType.FILE);

        System.out.println(screenshotAs.getAbsolutePath());

        FileHandler.copy(screenshotAs,new File("src/main/resources/Screenshit/chrome5.png"));

        chromeDriver.quit();
    }

}
