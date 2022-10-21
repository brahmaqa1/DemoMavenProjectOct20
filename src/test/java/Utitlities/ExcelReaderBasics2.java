package Utitlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderBasics2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//  APacche POi jar contains diff classes   and predefiend methods to read data from excel file 
		
		String ExcelFilePath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\Utitlities\\TestData.xlsx";
		
		// Workbook
		FileInputStream fis  = new FileInputStream(ExcelFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);
		// workbook - predefined interface in Apache POI
		Sheet sh = wb.getSheet("Login");
		// Sheeet -  predefined interface in Apache POI  --  sh - refer var - refers Login sheet
		
		// Sheet contains rows and Cells 
		String data00 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data 00 =" +  data00);
		
		//  01
		
		String data01 =sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data01 =" + data01);
		
		//  read data from 10
		String data10 = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println("data10 =" + data10);
		
		// read data from 11
		String data11 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("data11 =" + data11);
		
		
		// HW Read data 20
		
		//  HW Read data from  21
		
	// HW Read data 30
		
		//  HW Read data from  31
		
		
		//***************************************************************
		// if no  1.3
////		String data03 = sh.getRow(0).getCell(3).getStringCellValue();
//		// java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
//		
////		String data03 = sh.getRow(0).getCell(3).getStringCellValue().toString();// same erro
//		double data03 = sh.getRow(0).getCell(3).getNumericCellValue();
		String data03 = sh.getRow(0).getCell(3).toString();// same erro
		System.out.println("data03=" + data03);
//		
//		System.out.println("data03=" + data03);// 100.00   but actual 100
//		data03 = sh.getRow(2).getCell(3).getNumericCellValue();
//		
//		System.out.println("data23=" + data03);// 300.25
//		
//		CellType	ctype= sh.getRow(0).getCell(3).getCellType();
//		System.out.println("ctype=" +ctype);// ctype=NUMERIC
//		
//		ctype= sh.getRow(0).getCell(4).getCellType();
//		System.out.println("ctype=" +ctype);// ctype= BOOLEAN
//		
//		ctype= sh.getRow(1).getCell(5).getCellType();
//		System.out.println("ctype=" +ctype);// ctype=   numeric ??
		
//		ctype= sh.getRow(1).getCell(5).getDateCellValue();
		
		//*****************************************
		// read numeric data 
//		String data03=  sh.getRow(0).getCell(3).getStringCellValue(); // EXcpetion
//		System.out.println("data03 =" + data03);
		// java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
		//  0,3 is numeric call 
		
//		double  data03=  sh.getRow(0).getCell(3).getNumericCellValue();
//		System.out.println("data03 =" + data03);
		
//		  int i =  (int) data03;
		  //                  100.0 -->  100
		  //  i = 100
//		System.out.println(" type casting double val to int i= "+ i);
		//  type casting double val to int i= 100
		
		// to get cell type 
		CellType ctype= 	 sh.getRow(0).getCell(3).getCellType();
		
		System.out.println("Cell type =" +ctype);
		// Cell type =NUMERIC
		
		ctype= 	 sh.getRow(0).getCell(0).getCellType();
		System.out.println("00 String -Cell type =" +ctype);
		// 00 String -Cell type =STRING 
		
		ctype= 	 sh.getRow(0).getCell(4).getCellType();
		System.out.println("04 Boolean -Cell type =" +ctype); //  Boolean
		// 04 Boolean -Cell type =BOOLEAN
//		sh.getRow(0).getCell(4).getBooleanCellValue();
		
		ctype= 	 sh.getRow(1).getCell(5).getCellType();
		System.out.println("05 Date -Cell type =" +ctype);
		// 05 Date -Cell type =NUMERIC    ?????????  it should display DATE 
//		sh.getRow(1).getCell(5).getDateCellValue();
		
		// to read string val from Cell  =  getStringCellValue()
		//          int data from caell	 =   getNumericCellValue()
		//         boolean data from cell  - getBooleanCellValue()
		//         date data from cell   -   getDateCellValue()
		
		 
		if(ctype.equals(CellType.NUMERIC))
		{
			//          int data from caell	 =   getNumericCellValue()
		}
		if(ctype.equals(CellType.STRING))
		{
			// to read string val from Cell  =  getStringCellValue()
		}
		
		if(ctype.equals(CellType.BOOLEAN))
		{
//	         boolean data from cell  - getBooleanCellValue()
		}
		
		
		// rows cnt 
		int  RowsCnt= sh.getLastRowNum();
		System.out.println("RowsCnt =" +RowsCnt); // RowsCnt =3 but actual rows = 4  // Note :
		
		// columns count 
//		sh.getla
		int columnsCnt= sh.getRow(0).getLastCellNum();
		System.out.println("columnsCnt= "+columnsCnt);// columnsCnt= 3

	}

}
