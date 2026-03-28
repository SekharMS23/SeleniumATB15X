package org.sekhartesting.ex_06_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_02MAR {

    @Test
    public void Task_02MAR() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        WebElement add=driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        add.click();

        WebElement name=driver.findElement(By.id("firstName"));
        name.sendKeys("sekhar");

        WebElement last_name=driver.findElement(By.id("lastName"));
        last_name.sendKeys("MS");

        WebElement Email=driver.findElement(By.id("userEmail"));
        Email.sendKeys("sekhar@gmail.com");

        WebElement Age=driver.findElement(By.id("age"));
        Age.sendKeys("25");

        WebElement Salary=driver.findElement(By.id("salary"));
        Salary.sendKeys("100000");

        WebElement Department=driver.findElement(By.id("department"));
        Department.sendKeys("QA");

        WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();



    }

}
