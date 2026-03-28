package org.sekhartesting.ex_08_SVG_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sekhartesting.CommonToAll;
import org.sekhartesting.WaitHelpers;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Flipkart  extends CommonToAll {

    @Test
    public void test_Flipkart(){

        driver = new ChromeDriver();
        openBrowser(driver,"https://www.flipkart.com/search");
        driver.manage().window().maximize();

        WebElement search_box= driver.findElement(By.name("q"));
        search_box.sendKeys("macmini");

        List<WebElement> svgElement= driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElement.get(0).click();


        WaitHelpers.checkVisibility(driver,By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));


        List<WebElement> titles= driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for(WebElement title:titles){
            System.out.println(title.getText());
        }

        WaitHelpers.waitJVM(5000);
        driver.quit();




    }
}
