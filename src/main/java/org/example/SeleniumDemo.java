package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class SeleniumDemo {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        String title = driver.getTitle();
        //  assertEquals("Web form", title);


//        String searchBox = "//input[@id='twotabsearchtextbox']";
//        driver.findElement(By.xpath(searchBox)).sendKeys("headphones");
//        new Actions(driver).sendKeys(Keys.ENTER);
//        try {
//            driver.manage().timeouts().wait(4000000);
//        }
//        catch (InterruptedException e ){
//            e.printStackTrace();
//        }
        //  driver.switchTo().frame("ape_Gateway_right-2_desktop_iframe").findElement(By.id("ape_ni_viewability_iab")).click();
        Actions action = new Actions(driver);
        WebElement element = driver.switchTo().frame("ape_Gateway_desktop-ad-center-1_desktop_iframe").findElement(By.id("ad"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
        action.moveToElement(element).click().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

}
