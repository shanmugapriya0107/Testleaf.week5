package week5.day2.assignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataDuplicate_Leaftaps {

	public static String[][] readExcelDataDuplicateLead() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data_Leaftaps/Leaftaps_assignment.xlsx");
		XSSFSheet ws = wb.getSheet("DuplicateLead");
		
		int lastRowNum = ws.getLastRowNum();
		int lastCellNum = ws.getRow(0).getLastCellNum();
		String[][] str = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				str[i-1][j] = stringCellValue;
				
			}
			
		}
		wb.close();
		return str;

	}

}
