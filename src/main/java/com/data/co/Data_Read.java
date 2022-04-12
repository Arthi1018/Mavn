package com.data.co;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\welcome\\eclipse-workspace\\Students\\Techie_Maven\\Excel\\dataaa.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fis);
		
		Sheet s = w.getSheetAt(0);
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(1);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(ct.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		else {
			double d = c.getNumericCellValue();
			System.out.println(d);
		}
	}

}
