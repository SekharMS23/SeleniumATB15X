package org.sekhartesting.ex_06_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_WebTables {

    @Description("To verify the tables")
    @Test
    public void testWebTables(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //table[@id="customers"]/tbody/tr[5]/td[2]
        // tr[i] => 1,2,3,4,5,6
        // td[j] => 1,2,3

        String first_part = "//table[@id='customers']/tbody/tr[";
        // i
        String second_part = "]/td[";
        // j
        String third_part = "]";

        Integer row= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        Integer coloum=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        for(int i=2; i<row; i++){
            for(int j=1; j<coloum; j++){

                String dynamic_xpath=first_part + i + second_part +j +third_part;
               // System.out.println(dynamic_xpath);
                String data= driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);
                if(data.contains("Helen")){
                    String country_path= dynamic_xpath+ "/following-sibling::td";
                    String country_name= driver.findElement(By.xpath(country_path)).getText();
                    String company_path= dynamic_xpath+ "/preceding-sibling::td";
                    String company_name= driver.findElement(By.xpath(company_path)).getText();

                    System.out.println("-----------------");
                    System.out.println("Helen Bennett  is In "+country_name +"-" + company_name);
                }

            }

        }

        driver.quit();

    }

}
