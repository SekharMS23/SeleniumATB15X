package org.sekhartesting.ex_08_SVG_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sekhartesting.WaitHelpers;
import org.testng.annotations.Test;

import java.util.List;

public class Task_flipkart_6MAR {

    @Test
    public void task_flipkart_6MAR()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search");
        driver.manage().window().maximize();

        /* WaitHelpers.waitJVM(5);
        WaitHelpers.checkVisibility(driver,By.xpath("//span[@role='button' and contains(@class,'b3wTlE')]"));
        driver.findElement(By.xpath("//span[@role='button' and contains(@class,'b3wTlE')]")).click();*/


        WebElement search_box= driver.findElement(By.name("q"));
        search_box.sendKeys("macmini");

        List<WebElement> svgElement= driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElement.get(0).click();


        WaitHelpers.waitJVM(5);
        ////div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[3]/div

       /* List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='hZ3P6w']"));


        int minPrice = Integer.MAX_VALUE;


        for (WebElement priceElement : priceElements)  {

            try {
                String priceText = priceElement.getText();

                priceText = priceText.replace("₹","").replace(",","");
                int price = Integer.parseInt(priceText);

                if(price < minPrice){
                    minPrice = price;
                }

            } catch (Exception e) {
                // ignore non-price text
            }
        }

        System.out.println("Cheapest Price: ₹" + minPrice);
*/

        WaitHelpers.waitJVM(5);

        List<WebElement> priceElements = driver.findElements(By.xpath("//div[contains(text(),'₹')]"));

        int minPrice = Integer.MAX_VALUE;


        for (WebElement priceElement : priceElements) {

            try {
                String priceText = priceElement.getText();

                priceText = priceText.replaceAll("[^0-9]", "");
                int price = Integer.parseInt(priceText);

                if (price < minPrice) {
                    minPrice = price;
                }

            } catch (Exception e) {
                // ignore
            }
        }

        System.out.println("Cheapest Price: ₹" + minPrice);


    }
}
