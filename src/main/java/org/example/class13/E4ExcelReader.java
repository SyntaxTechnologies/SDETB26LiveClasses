package org.example.class13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    static void main() throws IOException {

        String path="Files/Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fis);
        Sheet sheet=excelFile.getSheet("HR");


        for (int rowNo = 0; rowNo < 7; rowNo++) {
            Row row=sheet.getRow(rowNo);

            for (int CellNo = 0; CellNo < 5; CellNo++) {
                System.out.print(row.getCell(CellNo)+" ");
            }
            System.out.println();
        }

       // System.out.println(row.getCell(0)+" "+row.getCell(1)+" "+row.getCell(2));


    }
}
