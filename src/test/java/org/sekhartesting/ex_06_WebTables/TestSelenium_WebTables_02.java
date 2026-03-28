package org.sekhartesting.ex_06_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_WebTables_02 {


    @Test
    public void TestSelenium_WebTables_02(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));


        for (int i = 0; i < rows.size(); i++) {

            List<WebElement> column_tables = rows.get(i).findElements(By.tagName("td"));
            for (WebElement c : column_tables) {
                System.out.println(c.getText());
            }

        }
        driver.quit();

        }


}
