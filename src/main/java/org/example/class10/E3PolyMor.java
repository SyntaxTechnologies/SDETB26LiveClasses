package org.example.class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.sql.Driver;

public class E3PolyMor {
    static void main() throws InterruptedException {

        WebDriver chromedriverObj = new ChromeDriver();
        WebDriver firefoxDriver=new FirefoxDriver();
        WebDriver edgeDriver=new EdgeDriver();

        WebDriver [] browserDrivers={chromedriverObj,firefoxDriver,edgeDriver};

        for (WebDriver driver:browserDrivers){
            Thread.sleep(3000);
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.get("https://www.facebook.com/");

            Thread.sleep(3000);

            driver.navigate().to("https://www.ebay.com/");
            Thread.sleep(3000);
            driver.quit();
        }














    }

}
