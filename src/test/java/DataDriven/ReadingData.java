package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	
	private static void readData() throws IOException {


		//Creating object for File class and pass the excel file location as argument
		
		File file = new File("E:\\Batch2\\Maven_Pro\\stuDetails.xlsx");
		
		
		//Creating object for FileInputStream and pass the file as argument
		
		FileInputStream fis = new FileInputStream(file);
		
		
		//create Object for workbook interface
		
		Workbook wb = new XSSFWorkbook(fis);
		
	    Sheet sh = wb.createSheet();
	    
	    Row row = sh.createRow(0);
	    
	    Cell cell = row.createCell(0);
		 
		switch(cell.getCellType()) {
		
		case STRING : 
		    String str = cell.getStringCellValue();
		    System.out.println(str);
		    break;
		
		case NUMERIC : 
			int num = (int) cell.getNumericCellValue();
			System.out.println(num);
			break;

		}
		
		
		
	
		
		
		
		

	}
	
	
	public static void main(String[] args) throws IOException {
		readData();
		
		
	}
	
	
	
}
