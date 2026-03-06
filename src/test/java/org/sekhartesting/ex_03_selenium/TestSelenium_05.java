package org.sekhartesting.ex_03_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_05 {


        @Test
        public void testApp_vwo() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://app.vwo.com");
            driver.manage().window().maximize();

            // Locators
            // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
            // Step 2 - Find the Password and enter the 1234.
            // Step 3 - Find the Submit and click on the button.
            // Step 4 - Wait some time.
            // Step 5 - Verify the message error message.

            //<input type="email" class="text-input W(100%)" name="username"
            // vwo-html-translate-attr="placeholder"
            // vwo-html-translate-placeholder="login:enterEmailID"
            // id="login-username" data-qa="hocewoqisi"
            // placeholder="Enter email ID">

            // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
            WebElement login= driver.findElement(By.id("login-username"));
            login.sendKeys("admin@admin.com");

            WebElement password = driver.findElement(By.id("login-password"));
            password.sendKeys("wrongpass@123");

            WebElement submit = driver.findElement(By.id("js-login-btn"));
            submit.click();


            Thread.sleep(3000);

            WebElement error = driver.findElement(By.className("notification-box-description"));
            System.out.println(error.getText());

            Assert.assertEquals(error.getText(), "Your email, password, IP address or location did not match");

            driver.quit();


        }
    }

