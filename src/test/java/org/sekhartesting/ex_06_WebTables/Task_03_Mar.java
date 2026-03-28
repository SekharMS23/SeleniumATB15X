package org.sekhartesting.ex_06_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_03_Mar {


    @Test
    public void Mar_Task_03_Mar() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        addEmployees(driver,"Sekhar","MS","skehar@gmail.com","25","100000","QA");
        addEmployees(driver,"Lava","Madhu","lava@gmail.com","20","28000","business");
        //addEmployees(driver,"mani","M","Mani@gmail.com","28","150000","field");

        //table[@class='-striped -highlight table table-striped table-bordered table-hover']/tbody/tr[1]/td[1]

        String first_part = "//table[@class='-striped -highlight table table-striped table-bordered table-hover']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        Integer rows=driver.findElements(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']/tbody/tr")).size();
        Integer column=driver.findElements(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']/tbody/tr[1]/td")).size();


        for(int i=1; i<=rows; i++){
            for(int j=1; j<=column; j++){

                String dynamic_xpath=first_part+i+second_part+j+third_part;
               // System.out.println(dynamic_xpath);
                String data=driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);
                if(data.contains("Legal")){

                    String legal_xpath= dynamic_xpath+"/following-sibling::td/div/span[@title='Delete']";
                    driver.findElement(By.xpath(legal_xpath)).click();

                }
           }
            System.out.println("------------");
        }
        //System.out.println("------------");

    }


    public static void addEmployees(WebDriver driver,String fname,String lname,
                                    String email,String Age, String Salary,String department)
    {

        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        driver.findElement(By.id("firstName")).sendKeys(fname);
        driver.findElement(By.id("lastName")).sendKeys(lname);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("age")).sendKeys(Age);
        driver.findElement(By.id("salary")).sendKeys(Salary);
        driver.findElement(By.id("department")).sendKeys(department);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
}
