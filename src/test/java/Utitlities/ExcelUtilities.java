package Utitlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {


	// Call :  getRowsCnt("")
	public static int getRowsCnt(String ExcelFilePath , String mySheet ) throws EncryptedDocumentException, IOException
	{		
		//		String ExcelFilePath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\Utitlities\\TestData.xlsx";

		// Workbook
		FileInputStream fis  = new FileInputStream(ExcelFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);
		// workbook - predefined interface in Apache POI
		//		Sheet sh = wb.getSheet("Login");
		Sheet sh = wb.getSheet(mySheet);
		int rowsCnt =	sh.getLastRowNum();

		return rowsCnt +1 ; //  rows =3 ButActual Rows cnt  =4

	}

	// HW getColumnsCnt()
//
//	
	public static int getColumnsCnt(String ExcelFilePath , String mySheet ) throws EncryptedDocumentException, IOException
	{		
		//		String ExcelFilePath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\Utitlities\\TestData.xlsx";

		// Workbook
		FileInputStream fis  = new FileInputStream(ExcelFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);
		// workbook - predefined interface in Apache POI
		//		Sheet sh = wb.getSheet("Login");
		Sheet sh = wb.getSheet(mySheet);
		int columnsCnt= sh.getRow(0).getLastCellNum();
//		System.out.println("columnsCnt= "+columnsCnt);// columnsCnt= 3

		return columnsCnt ; //  

	}


	public static String readDataFromExcel(String ExcelFilePath , String mySheet, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis  = new FileInputStream(ExcelFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet(mySheet);
//		String data = sh.getRow(rowNo).getCell(cellNo).getStringCellValue();
//		String data= 	sh.getRow(rowNo).getCell(cellNo).getNumericCellValue();	
		String data= 	sh.getRow(rowNo).getCell(cellNo).toString();		

		return data;		
	}
	
	public static List<String> readAllRowsDataFromExcel(String ExcelFilePath , String mySheet, String columnName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis  = new FileInputStream(ExcelFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet(mySheet);
//		String data = sh.getRow(rowNo).getCell(cellNo).getStringCellValue();
//		String data= 	sh.getRow(rowNo).getCell(cellNo).getNumericCellValue();
		int cellno = getColumnNoBasedOnColumnName(ExcelFilePath, mySheet, columnName);
		int rowsCnt= getRowsCnt(ExcelFilePath, mySheet);
		List<String> dataList = new ArrayList<String>() ;
		for(int  i=1 ; i<= rowsCnt-1; i++ )
		{
			String data= 	sh.getRow(i).getCell(cellno).toString();
			System.out.println("Data =" + data);
			
			dataList.add(data);
		}
			

		return dataList;		
	}

	// if sheeet is there in excel file ,  this methos return true else false
	public static boolean issheetExist(String xlFilePath , String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis  = new FileInputStream(xlFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);
		
//		int indexno= wb.getSheetIndex("Login");
//		int indexno= wb.getSheetIndex("RenameLogin");
		// if given sheet is available , it returns index no of sheet  else  -1
		int indexno= wb.getSheetIndex(sheetName);
		System.out.println("Given sheeet = "+ sheetName + " index no =" + indexno );
		
		if(indexno == -1)
		{
			System.out.println("Given sheet =" +sheetName +" is not exist in excel file ");
			return false;
		}
		else
		{
			System.out.println("Given sheet =" +sheetName +" is  exist in excel file ");
			return true;
		}
				
	}

	
	
	
	public static int getColumnNoBasedOnColumnName(String xlFilePath , String sheetName , String columnName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis  = new FileInputStream(xlFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);
			
		Sheet sh =wb.getSheet(sheetName);
		int colNo = -1 ;
		boolean  colFound = false;
		
		for(int i=0;i<=getColumnsCnt(xlFilePath, sheetName)-1;i++)
		{  //  0 to 2
			//   row no is fixed , col no must be varied
			String ColumnData  = sh.getRow(0).getCell(i).toString();
			//                                0 ,0  product name 
			//								 0,1  Qty
			//									0,2 Prpoduct Id
			
//			System.out.println("all Columns data = "+ColumnData );
			if(ColumnData.equals(columnName))
			{
				System.out.println("Column name =" + columnName + " is found in given sheet");
				colNo = i;
				colFound = true;
				break;
			}		
			
		}
		
		
		if(colFound==true)
		{
			System.out.println("Column name = " + columnName+" is found at Column no ="+ colNo);
		}
		else
		{
			System.out.println("Column name = " + columnName+" is  not found at Column no ="+ colNo);
		}
		
		return colNo;
			
	}
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String ExcelFilePath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\Utitlities\\TestData.xlsx";

//		int rowscnt= getRowsCnt(ExcelFilePath, "Login");
//		System.out.println("rowscnt = "+ rowscnt);
//
//
//		// HW  Define reusable method to get columns cnt 
//
//		// Read data from excel file based on row and cell no 
//		String data00 = readDataFromExcel(ExcelFilePath, "Login", 0, 0);
//
//		System.out.println("data00 =" + data00);
//
//		String data01 = readDataFromExcel(ExcelFilePath, "Login", 0, 1);
//
//		System.out.println("data01 =" + data01);
//
////		String data03 = readDataFromExcel(ExcelFilePath, "Login", 0, 3);
//		//   if colno =  3 is not there    it throws NullPointerException
////		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "org.apache.poi.ss.usermodel.Cell.getStringCellValue()" because the return value of "org.apache.poi.ss.usermodel.Row.getCell(int)" is null
////				at Utitlities.ExcelUtilities.readDataFromExcel(ExcelUtilities.java:40)
//
//		String data03 = readDataFromExcel(ExcelFilePath, "Login", 0, 3);
//		System.out.println("data01 =" + data03);
//		
//		 data03 = readDataFromExcel(ExcelFilePath, "Login", 0, 4);
//			System.out.println("data04 =" + data03);
//		
//	 data03 = readDataFromExcel(ExcelFilePath, "Login", 3, 5);
//		System.out.println("data01 =" + data03);
//		
//		boolean issheetExist =  issheetExist(ExcelFilePath, "Login");
//		System.out.println("issheetExist= "+issheetExist);
//		issheetExist =	issheetExist(ExcelFilePath, "Reanme");
//		System.out.println("issheetExist= "+issheetExist);
		
		//  i/p:    Sita 
		// o/p: row no 
		
		
		int colno =getColumnNoBasedOnColumnName(ExcelFilePath, "CreateOrder", "ProductName");
		System.out.println("colno =" +colno);
		
		getColumnNoBasedOnColumnName(ExcelFilePath, "CreateOrder", "Qty");
		getColumnNoBasedOnColumnName(ExcelFilePath, "CreateOrder", "ProductID");
		
		getColumnNoBasedOnColumnName(ExcelFilePath, "CreateOrder", "ProductOffer");
		
		


	}

}
