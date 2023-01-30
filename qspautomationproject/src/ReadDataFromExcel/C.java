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

public class C {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/B.xlsx");
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sh = wh.getSheet("Sheet1");
		Row row = sh.getRow(2);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
	}

}
