package com.bcone.punetimetracking.excelreader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath) {
		try {
			File file = new File(excelPath);
			FileInputStream inputStream = new FileInputStream(file);
			wb = new XSSFWorkbook(inputStream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNumber, int row, int col) {
		sheet = wb.getSheetAt(sheetNumber);
		
		if(col == 4){
			String data = sheet.getRow(row).getCell(col).getNumericCellValue()+"";
			Double d = Double.parseDouble(String.valueOf(data));
			//return Integer.valueOf(d.intValue()).toString();
			return d.toString();
		} else{
			return sheet.getRow(row).getCell(col).getStringCellValue();
		}
	}
	
	
	public int getRowCount(int sheetIndex) {
		
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
	public int getColCount(int sheetIndex) {
		sheet = wb.getSheetAt(0);;
		int col = sheet.getRow(0).getLastCellNum();
		return col;
	}
}
