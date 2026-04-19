package org.example.class13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigFiles {
    static void main() throws IOException {

        //location of the file
        String path="Files/Config.properties";

        // reading the file in the form of bytes data type
        FileInputStream fis=new FileInputStream(path);

        // specially designed class to convert bytes into maps and help with other things
        Properties properties=new Properties();
        // loading bytes from fileInputStream into maps
        properties.load(fis);
        System.out.println(properties.get("url"));



    }
}
