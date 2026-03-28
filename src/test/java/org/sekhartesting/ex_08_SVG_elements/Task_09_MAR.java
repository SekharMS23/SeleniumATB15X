package org.sekhartesting.ex_08_SVG_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sekhartesting.CommonToAll;
import org.sekhartesting.WaitHelpers;
import org.testng.annotations.Test;

import javax.swing.*;

public class Task_09_MAR  extends CommonToAll {

    @Test
    public void mar() {

        driver =new ChromeDriver();
        openBrowser(driver,"https://www.booking.com/");

        WaitHelpers.checkVisibility(driver,By.xpath("//button[@aria-label='Dismiss sign-in info.']"));

        driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();

        WaitHelpers.waitJVM(5);

        WebElement going_button = driver.findElement(By.xpath("//span[normalize-space()='Going to']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(going_button).sendKeys("DELHI" +Keys.TAB +Keys.ENTER).build().perform();

    }

}
