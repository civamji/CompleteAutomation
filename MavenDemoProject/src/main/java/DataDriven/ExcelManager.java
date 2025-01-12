package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {
	
	private static String file_opening = "src/main/java/DataDriven.xlsx";
	
	public static Object[][] getData() throws IOException  {
		
		String[][] data;
		
		//Load the Excel File
		File f1 = new File(file_opening);
		FileInputStream fin = new FileInputStream(f1);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Get the row and column count
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		data = new String[rowCount][colCount];
		
		for (int i = 1; i<=rowCount; i++) {
			for(int j = 0; j<colCount; j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		
		wb.close();
		fin.close();
		return data;
		
	}

}
