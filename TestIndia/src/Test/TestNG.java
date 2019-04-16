package Test;

import BaseUtils.ApplicationContext;
import BaseUtils.DriverFactory;
import BaseUtils.UtilityFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.rmi.CORBA.Util;

public class TestNG {

    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setUp () {
        System.out.println("Starting Test");
        driver = DriverFactory.open(ApplicationContext.getBrowserTypeChrome());
        driver.get(ApplicationContext.getUrlOlxIn());
    }


    @Test(groups = "p1")
    public void loadHomePage () { UtilityFunctions.elementPresent(driver, By.cssSelector(ApplicationContext.getSellButtonCssSelector()));}

    @AfterTest(alwaysRun = true)
    public void tearDown () {
        System.out.println("Closing test");
        driver.quit(); }
}
