package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NameRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stubne
		FileInputStream fis = new FileInputStream("./data/data1.xlsx");
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sh = wh.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(2);
		String data = cell.getStringCellValue();
		System.out.println(data);
	}

}
