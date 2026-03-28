package org.sekhartesting.ex_04_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

public class TestSelenium_08_MiniProject {

    @Owner("Sekhar")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify login is working")
    @Test
    public void testSelenium_08_MiniProject() throws InterruptedException {

        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("@Hacker4321");
        WebElement login = driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(3000);

        WebElement h6 = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));

        System.out.println(h6.getText());
        Assert.assertEquals(h6.getText(),"PIM");

        driver.quit();


    }
}
