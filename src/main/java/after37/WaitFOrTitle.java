package after37;

import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class WaitFOrTitle implements Function<WebDriver,Boolean> {
    @Override
    public Boolean apply(WebDriver webDriver) {
        String currentTitle=webDriver.getTitle();
        return !currentTitle.equalsIgnoreCase(ExplicitWait.oldTitle);
    }
}
