package utils;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends PageObject {
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
