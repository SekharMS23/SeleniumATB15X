package org.sekhartesting.ex_02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium_03_AssertJ {

    @Test
    public void testSelenium_03_AssertJ() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //  TestNG
        // Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/?zx=1771811294977&no_sw_cr=1");
        Assert.assertEquals(driver.getTitle(),"Google");


        // AssertJ
        /*assertThat(driver.getTitle())
                .isNotBlank()
                .isNotEmpty()
                .isNotNull()
                .isEqualTo("Google");*/

    }
}
