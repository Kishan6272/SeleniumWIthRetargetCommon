package css;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomBy {

    public static By placeholder(String placeholderText)
    {
        return new ByPlaceHolder(placeholderText);
    }


    public static class ByPlaceHolder extends By {


        private  final String placeholderText;


        public ByPlaceHolder(String placeholderText)
        {
           this.placeholderText=placeholderText;
        }

        @Override
        public List<WebElement> findElements(SearchContext context) {
            return List.of();
        }
    }




}
