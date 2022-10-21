package Utitlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataHSSFXSSWorkbook {

	public static void main(String[] args) throws IOException {
		//  2 classes  -- to read data from excel file 
//		HSSFWorkbook  -predefined class  in Apache POI  
//						can be used to read data from .xls file
		
//		XSSFWorkbook  - predefined class  in Apache POI 
//					 - cna be used to read data from .xlsx file
		
		String ExcelFilePath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\Utitlities\\TestData2.xls";

		FileInputStream  fis  = new FileInputStream(ExcelFilePath);
		
		HSSFWorkbook  hssfWb =  new HSSFWorkbook(fis);
		HSSFSheet  hssfSh =  hssfWb.getSheet("Login");
		
		
		// sheet conatian rows and cells
		 String data00 = hssfSh.getRow(0).getCell(0).getStringCellValue();
		 System.out.println("data 00=" + data00);
		 
		 // HW  read data from file  .xlsx format use XSSFWorkbook
		 
	}

}
