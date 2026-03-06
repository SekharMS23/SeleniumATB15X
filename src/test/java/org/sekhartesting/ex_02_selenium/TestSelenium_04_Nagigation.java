package org.sekhartesting.ex_02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_04_Nagigation {
    @Test
    public void TestSelenium_04_Nagigation(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }

}
