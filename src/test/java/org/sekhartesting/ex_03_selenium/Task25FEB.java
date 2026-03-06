package org.sekhartesting.ex_03_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task25FEB {



    @Description("To find the ")
    @Test
    public void task25FEB()
    {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make= driver.findElement(By.id("btn-make-appointment"));
        make.click();

        WebElement username= driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password= driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement submit_button=driver.findElement(By.tagName("button"));
        submit_button.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("katalon-demo-cura.herokuapp.com/#appointment"));

        WebElement message= driver.findElement(By.tagName("h2"));

        System.out.println(message.getText());
        Assert.assertEquals(message.getText(),"Make Appointment");



    }
}
