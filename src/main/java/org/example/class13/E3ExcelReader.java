package org.example.class13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E3ExcelReader {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fis);
        Sheet sheet=excelFile.getSheet("Sheet1");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(2);
        System.out.println(cell);

    }
}
