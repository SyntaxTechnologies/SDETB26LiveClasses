package org.example.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> read() {
        String path = "Files/Employees.xlsx";

        ArrayList<Map<String, String>> sheetData = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook excelFile = new XSSFWorkbook(fis);) {
            Sheet sheet = excelFile.getSheet("HR");

            Row headerRow = sheet.getRow(0);
            for (int rowNo = 1; rowNo < sheet.getPhysicalNumberOfRows(); rowNo++) {
                Row actualRow = sheet.getRow(rowNo);

                Map<String, String> rowMap = new LinkedHashMap<>();
                for (int CellNo = 0; CellNo < actualRow.getPhysicalNumberOfCells(); CellNo++) {

                    String key = headerRow.getCell(CellNo).toString();
                    String value = actualRow.getCell(CellNo).toString();
                    rowMap.put(key, value);
                }
                sheetData.add(rowMap);
            }


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return sheetData;
    }
}
