package utilities;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fillo fillo=new Fillo();
		Connection connection = null;
		try {
			connection=fillo.getConnection("C:\\MyInstallations\\Test.xlsx");
			String strQuery="Select * from TestCase";
			Recordset recordset=connection.executeQuery(strQuery);
			ArrayList<String> fieldNammes = recordset.getFieldNames();
			while(recordset.next()){
			for(String fieldName:fieldNammes)
			System.out.println(fieldName+": "+recordset.getField(fieldName));
			}
			 
			recordset.close();
			connection.close();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}
}
