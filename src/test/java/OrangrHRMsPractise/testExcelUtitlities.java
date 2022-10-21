package OrangrHRMsPractise;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

import Utitlities.ExcelUtilities;

public class testExcelUtitlities {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		ExcelUtilities  xlUtil = new ExcelUtilities();
		
		String xlPath = ".\\TestData.xlsx";
		String SheetName = "CreateUsers";
		
		int rowsCnt=  xlUtil.getRowsCnt(xlPath, SheetName);
		int colsCnt =  xlUtil.getColumnsCnt(xlPath, SheetName);
		
//		for(int i=1;i<=rowsCnt-1;i++)
//		{
//			for(int j=0;j<colsCnt-1;j++)
//			{
//				String data = xlUtil.readDataFromExcel(xlPath, SheetName, i, j);
//				System.out.println("data =" +data);
//			}	
//			System.out.println(" ---------------> Next rows ");
//		}
		
//		xlUtil.readDataFromExcel(xlPath, "CreateUsers", 0, 0);
		
		List<String>	userRoleList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "UserRole");
		System.out.println("userRoleList= " +userRoleList);
		
		List<String>	userNameList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "Username");
		System.out.println("userNameList= " +userNameList);
		

	}

}
