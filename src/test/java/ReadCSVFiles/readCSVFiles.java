package ReadCSVFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCSVFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file= "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\DemoMavenProject\\src\\test\\java\\ReadCSVFiles\\TestDataCSV.csv";

		String line = "";  
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader(file));  
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				String[] employee = line.split(",");    // use comma as separator  
				System.out.println("CustomerName=" + employee[0] + ", CusotmerDescription" + employee[1] + ",CustId=" + employee[2] );  
			}  
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}  