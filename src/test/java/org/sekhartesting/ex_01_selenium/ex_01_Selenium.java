package org.sekhartesting.ex_01_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_Selenium {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.quit();
    }
}
