package org.example.class13;

import org.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class E2ConfigFiles {
    static void main() throws IOException {

        String url=ConfigReader.read("url");

        WebDriver driver=new ChromeDriver();
        driver.get(url);

    }
}
