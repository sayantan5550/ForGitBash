package Generic_Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String getExcelData(String SheetName, int RowNum, int CelNum) throws Throwable {
		FileInputStream efis = new FileInputStream("C:\\Users\\91910\\Desktop\\QSPIDERS\\JAVA\\eclipse_workspace_forJava\\vTigerJan5\\src\\test\\resources\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(efis);
		Sheet sh = book.getSheet(SheetName);
		Row row = sh.getRow(RowNum);
		Cell cel = row.getCell(CelNum);
		String value = cel.getStringCellValue();
		return value;
	}

}
