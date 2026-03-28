package org.sekhartesting.ex_04_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_09_mini {
    @Owner("Sekhar")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify login is working")
    @Test
    public void testSelenium_09_Mini() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Hacker@4321");
        WebElement login = driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(3000);

        WebElement h6 = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));


    }
}
