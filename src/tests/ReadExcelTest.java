package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest {

	public static void main(String[] args) throws Exception {
		
		/**Download apache POI jar
		 * Pull Jar to the project using build path
		 * Create script	
		 * 		to conenct to the excel
		 * 		to read the data from excel	 */
		

		File f = new File("D:\\Drivers\\ReadExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis); // to read XLSX workbook
	//	Workbook wb = new HSSFWorkbook(fis); to read XLS workbook excel sheet
		
		Sheet s = wb.getSheet("Data");
		//Sheet s = wb.getSheetAt(0);
		
		//to read the data from excel
		
		int rowCount = s.getLastRowNum()-s.getFirstRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<rowCount+1;i++) {
			Row r = s.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++) {
				System.out.println(r.getCell(j).getStringCellValue());
				//System.out.println(r.getCell(j).getNumericCellValue());
			}
		}
		
	}

}
