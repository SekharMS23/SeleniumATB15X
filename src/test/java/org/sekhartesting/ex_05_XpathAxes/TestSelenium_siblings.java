package org.sekhartesting.ex_05_XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_siblings {


    @Test
    public void testSelenium_siblings() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/xpath/");

       List<WebElement> element = driver.findElements(By.xpath("//div[@class='Mammal']"));
       element.get(0).click();




    }
}
