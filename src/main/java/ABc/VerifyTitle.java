package ABc;

import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyTitle {

    public static void main(String[] args) {
        ChromeDriver  driver=new ChromeDriver();

        driver.get("https://practicesoftwaretesting.com/");

        String str=driver.getTitle();
        System.out.println(str);

        String  str1= "Practice Software Testing - Toolshop - v5.0";

        if(str1.equals(str))
        {
            System.out.println(str);
        }
       // Assert.org.testng.Assert.assertEquals("actual", "expected", "String message");


        driver.quit();
    }
}
