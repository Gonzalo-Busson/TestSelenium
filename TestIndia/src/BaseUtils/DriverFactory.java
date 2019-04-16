package BaseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


    public static WebDriver open (String browserType){

        if (browserType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","/Users/gonzalo/Desktop/JavaPrograms/Selenium/FireFox/geckodriver");
            return new FirefoxDriver();
        }else{
            System.setProperty("webdriver.gecko.driver","/Users/gonzalo/Desktop/JavaPrograms/Selenium/Chrome/chromedriver.exe");
            return new ChromeDriver();
        }

    }
}
