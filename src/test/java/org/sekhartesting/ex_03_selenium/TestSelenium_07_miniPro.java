package org.sekhartesting.ex_03_selenium;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class TestSelenium_07_miniPro {

    @Owner("Sekhar")
    @Severity(SeverityLevel.BLOCKER)
    //@TmsLink("https://bugzz.atlassian.net/browse/VWO-19")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void TestSelenium_07_miniPro() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/");
        //driver.manage().window().maximize();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
       // Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email=driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement check_box=driver.findElement(By.name("gdpr_consent_checkbox"));
        check_box.click();





        WebElement submit_button= driver.findElement(By.tagName("button"));
        submit_button.click();

//        Thread.sleep(3000);

        WebElement error_msg= driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

//        driver.quit();
    }

    /*@Owner("Pramod")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugzz.atlassian.net/browse/VWO-19")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify() throws InterruptedException {

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://app.vwo.com");
//
//        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
//        a_tag_partial_match.click();
//

        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/");


        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        WebElement button_create_account = driver.findElement(By.tagName("button"));
        button_create_account.click();

        //<div
        // class="C(--color-red)
        // Fz(--font-size-12) Trsp(--Op)
        // Trsdu(0.15s) Op(0)
        // invalid-input+Op(1)
        // invalid-reason">
        // A value for this field is required.</div>

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");








    }
*/
}
