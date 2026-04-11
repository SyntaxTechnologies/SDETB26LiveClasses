package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class E2PolyMor {
    static void main() throws InterruptedException {

        ChromeDriver chromedriverObj = new ChromeDriver();
        Thread.sleep(3000);
        chromedriverObj.manage().window().maximize();
        Thread.sleep(3000);
        chromedriverObj.get("https://www.facebook.com/");

        Thread.sleep(3000);

        chromedriverObj.navigate().to("https://www.ebay.com/");
        Thread.sleep(3000);
        chromedriverObj.quit();


        FirefoxDriver firefoxDriver=new FirefoxDriver();
        Thread.sleep(3000);
        firefoxDriver.manage().window().maximize();
        Thread.sleep(3000);
        firefoxDriver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        firefoxDriver.navigate().to("https://www.ebay.com/");
        Thread.sleep(3000);
        firefoxDriver.quit();


        EdgeDriver edgeDriver=new EdgeDriver();
        Thread.sleep(3000);
        edgeDriver.manage().window().maximize();
        Thread.sleep(3000);
        edgeDriver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        edgeDriver.navigate().to("https://www.ebay.com/");
        Thread.sleep(3000);
        edgeDriver.quit();








    }

}
