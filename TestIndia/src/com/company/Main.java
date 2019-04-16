package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/gonzalo/Desktop/JavaPrograms/Selenium/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.executeautomation.com/demosite/Login.html");

        // find element :locate the element, determine the action, pass any parameter.

        driver.findElement(By.name("UserName")).sendKeys("Tu vieja");
        driver.findElement(By.name("Password")).sendKeys("en tanga");
        driver.findElement(By.name("Login")).click();

        String message = driver.findElement(By.id("cssmenu")).getText();
        System.out.println("CONFIRMATION : "+message);

        String pageTitle = driver.getTitle();
        if (pageTitle == "Execute Automation"){
            System.out.println("PAGE TITLE: TEST PASSED") ;
        }
        driver.close();
    }
}
