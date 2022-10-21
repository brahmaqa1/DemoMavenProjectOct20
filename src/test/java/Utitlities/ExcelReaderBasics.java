package Utitlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderBasics {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//  APacche POi jar contains diff classes   and predefiend methods to read data from excel file 
		
		String ExcelFilePath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\Utitlities\\TestData.xlsx";
		
		// Workbook
		FileInputStream fis  = new FileInputStream(ExcelFilePath);
		Workbook   wb =  WorkbookFactory.create(fis);
		// workbook - predefined interface in Apache POI
		Sheet sh = wb.getSheet("Login");
		// Sheeet -  predefined interface in Apache POI  --  sh - refer var - refers Login sheet
		
		// HW Read all rows data from 1st column
		
		// HW Read all rows data from 2nd column
		
		
		// HW Read data from all rows and all Columns 
		//  use 2 for loops 
		//  00 01 02 03
		//  10 11 12 12
		//

	}

}
