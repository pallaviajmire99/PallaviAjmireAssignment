package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
public static String getTestData(int row, int cell, String SheetName) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("D:\\New folder\\KotakBank\\src\\test\\resources\\Book1.xlsx");
	String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	
}
}
