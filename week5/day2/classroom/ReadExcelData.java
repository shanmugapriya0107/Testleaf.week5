package week5.day2.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		int lastCellNum = ws.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				
			}
			
		}
		
	}

}
