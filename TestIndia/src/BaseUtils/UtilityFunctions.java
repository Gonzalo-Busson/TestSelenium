package BaseUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UtilityFunctions {

    public static void elementPresent(WebDriver driver, By locator) {
        boolean element = driver.findElement(locator).isDisplayed();
        Assert.assertTrue(element, "Element is displayed");

    }
}
