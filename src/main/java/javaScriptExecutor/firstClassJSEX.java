package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstClassJSEX {

    public static void main(String[] args) throws InterruptedException {
        //  https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt


        ChromeDriver driver=new ChromeDriver();


        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");


        JavascriptExecutor jsexD = (JavascriptExecutor) driver;
        String script="return document.title;";
        System.out.println( (String) jsexD.executeScript(script));


        driver.switchTo().frame("iframeResult");

        jsexD.executeScript("myFunction()");

       // Thread.sleep(2000);

        driver.switchTo().alert().accept();


        //highliting the elements
       WebElement elem= driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));

        jsexD.executeScript("arguments[0].style.border='5px solid teal'",elem);
        Thread.sleep(2000);

        driver.navigate().to("https://www.w3schools.com/");

        WebElement LearnMoreButton=driver.findElement(By.xpath("//a[text()='Learn More' and @class='w3-button ga-fp w3-block tut-button']"));

        jsexD.executeScript("arguments[0].scrollIntoView(true);",LearnMoreButton);


        Thread.sleep(2000);



        driver.quit();


    }
}
