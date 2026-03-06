package org.sekhartesting.ex_02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_01 {


    @Test
    public void testSelenium_01(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        driver.quit();
    }




}
