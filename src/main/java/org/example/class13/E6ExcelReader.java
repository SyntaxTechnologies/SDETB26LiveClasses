package org.example.class13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.utils.ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class E6ExcelReader {
    static void main() throws IOException {

        var data= ExcelReader.read();
        System.out.println(data.get(0));
        System.out.println(data.get(0).get("First Name"));




    }
}
