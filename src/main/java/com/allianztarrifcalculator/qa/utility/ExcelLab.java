package com.allianztarrifcalculator.qa.utility;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author time
 * @Date 11/27/2022
 */
public class ExcelLab {

    public static FileInputStream fi; //path to Excel file
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;

    //creating object to fetch excel workbook and access a sheets row
    public static int getRowCount(String xlfilePath, String xlsheet) throws IOException {
        fi = new FileInputStream(xlfilePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        int rowCount = ws.getLastRowNum();
        wb.close();
        fi.close();
        return rowCount;
    }

    //creating object to fetch excel workbook and access a sheets cell
    public static int getCellCount(String xlfilePath, String xlsheet, int rownum) throws IOException{
        fi = new FileInputStream(xlfilePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        int cellCount = row.getLastCellNum();
        wb.close();
        fi.close();
        return  cellCount;
    }

    //creating object to fetch excel workbook and access cellData
    public static String getCellData(String xlfilePath, String xlsheet, int rowNum, int colNum ) throws IOException{
        fi = new FileInputStream(xlfilePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rowNum);
        cell = row.getCell(colNum);
        String data;

        try{
            DataFormatter fm = new DataFormatter();
            String cellData = fm.formatCellValue(cell);
            return cellData;
        }
        // catching empty cell that might throw an exception
        catch (Exception e){
            data = "";
        }
        wb.close();
        fi.close();
        return data;
    }

    //creating object to fetch excel workbook and set cellData
    public static void setCellData(String xlfilePath, String xlsheet, int rowNum, int colNum, String data ) throws IOException
    {
        fi = new FileInputStream(xlfilePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rowNum);
        cell = row.createCell(colNum);
        cell.setCellValue(data);
        fo = new FileOutputStream(xlfilePath);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }
}
