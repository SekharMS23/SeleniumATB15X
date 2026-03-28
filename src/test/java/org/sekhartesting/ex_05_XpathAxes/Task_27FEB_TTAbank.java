package org.sekhartesting.ex_05_XpathAxes;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_27FEB_TTAbank {

   @Owner("sekhar")
    @Description("To transfer funds")
    @Test
    public void task_27FEB_TTAbank() throws InterruptedException {

       WebDriver driver =  new ChromeDriver();
       driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
       driver.manage().window().maximize();

       WebElement signup= driver.findElement(By.xpath("//button[text()='Sign Up']"));
       signup.click();

       WebElement Text_ele= driver.findElement(By.xpath("//input[@type='text']"));
       Text_ele.sendKeys("Sekhar");

       WebElement username= driver.findElement(By.xpath("//input[@type='email']"));
       username.sendKeys("sekhar@gmail.com");

       WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
       password.sendKeys("sekhar");

        WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
        submit.click();

        Thread.sleep(3000);

        WebElement trans=driver.findElement(By.xpath("//button[text()='Transfer Funds']"));
        trans.click();

        WebElement trans_money=driver.findElement(By.xpath("//input[@type='number']"));
        trans_money.sendKeys("5000");

        WebElement entering=driver.findElement(By.xpath("//button[text()='Continue']"));
        entering.click();

        WebElement conform= driver.findElement(By.xpath("//button[text()='Confirm Transfer']"));
       conform.click();

       Thread.sleep(3000);

       WebElement Dashboard= driver.findElement(By.xpath("//button[text()='Dashboard']"));
       Dashboard.click();

       WebElement checking= driver.findElement(By.xpath("//h3[normalize-space()='$45,000.00']"));

       //h3[normalize-space()='$45,000.00']
       //Assert.assertEquals(checking.getText(), "Your email, password, IP address or location did not match");
       Assert.assertEquals(checking.getText(), "$45,000.00");
       System.out.println(checking.getText());

       driver.quit();
   }

}
