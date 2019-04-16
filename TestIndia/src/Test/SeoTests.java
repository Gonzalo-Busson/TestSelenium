package Test;

import BaseUtils.ApplicationContext;
import BaseUtils.DriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class SeoTests {

    private WebDriver driver;

    @Before
    public void Before () {
        driver = DriverFactory.open(ApplicationContext.getBrowserTypeFireFox());
        driver.get(ApplicationContext.getUrlOlxIn());
    }


    @Test
    public void TitleVerification() {
        String expectedTitle = ApplicationContext.getUrlOlxInTitle();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);




    }
    @Test


    @After
    public void after (){
        driver.quit();

    }



}
