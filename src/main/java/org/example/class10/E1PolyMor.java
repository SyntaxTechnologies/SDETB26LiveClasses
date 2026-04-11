package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;

public class E1PolyMor {
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


    }

}
