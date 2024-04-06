package testngdemo1;

/*import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datafetch1 {
	public Object [][] getdatafromexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream ("C:\\Users\\shiva\\OneDrive\\Desktop\\Fbdata.xlsx");
	    workbook workbook = WorkbookFactory.create(fis); 
	    
	     int rownum = workbook.getSheet("Sheet1").getLastRowNum();
	     
	     int cellnum = workbook.getSheet("Sheet1").getRow(2).getLastCellNum();
	     
	     Object[][]data = new Object [rownum][cellnum];
	     
	     for (int i=0; i<rownum-1; i++)
	     {
	    	 for (int j=0; j<cellnum; j++)
	    	 {
	    		 data[i][j]= workbook.getSheet("Sheet1").getRow(i+1).getCell(j).getStringCellValue();
	    	 }
	     }
	     
	     return data;
	}

} */
