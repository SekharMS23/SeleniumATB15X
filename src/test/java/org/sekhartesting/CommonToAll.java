package org.sekhartesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll {

    public ChromeDriver driver;

    public void openBrowser(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver) {
        driver.quit();
    }

    public void WaitforVisiblity(WebDriver driver, int timeInSeconds, String xpath) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }

    public void WaitforInvisiblity(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitForTextToBePresent(WebDriver driver, int timeInseconds, String xpath, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInseconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)), text));
        // wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)),text));

    }

    public void WaitforAlert(WebDriver driver, int timeInseconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInseconds));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void WaitforJVM(int time) {


        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickElementFound(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

}
