package org.example.class13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class E5ExcelReader {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fis);
        Sheet sheet=excelFile.getSheet("HR");


        ArrayList<Map<String,String>> sheetData=new ArrayList<>();
        Row headerRow=sheet.getRow(0);
        for (int rowNo = 1; rowNo < 7; rowNo++) {
            Row actualRow=sheet.getRow(rowNo);

            Map<String,String> rowMap=new LinkedHashMap<>();
            for (int CellNo = 0; CellNo < 5; CellNo++) {

                String key=headerRow.getCell(CellNo).toString();
                String value=actualRow.getCell(CellNo).toString();
                rowMap.put(key,value);
            }
            sheetData.add(rowMap);
        }

        System.out.println(sheetData);


    }
}
