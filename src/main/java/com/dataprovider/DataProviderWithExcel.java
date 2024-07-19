package com.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class DataProviderWithExcel {
	
	private Workbook workbook;
	
	public DataProviderWithExcel(String filePath) throws FileNotFoundException
	{
		 FileInputStream file = new FileInputStream(new String(filePath));
		 try {
			this.workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public String getCellValue(String sheetName, int rowNum, int colNum) {
        Sheet sheet = (Sheet) workbook.getSheet(sheetName);
        Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowNum);
        Cell cell = (Cell) row.getCell(colNum);
        return cell.toString();
    }
	



}
