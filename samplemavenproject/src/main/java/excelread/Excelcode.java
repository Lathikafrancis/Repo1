package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	public static String readStringData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\LENOVO\\Documents\\Java\\Untitled spreadsheet.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		return c.getStringCellValue();
	}
public static String readintegerdata(int row, int col) throws IOException

{
	f = new FileInputStream("C:\\Users\\LENOVO\\Documents\\Java\\Untitled spreadsheet.xlsx");
	w = new XSSFWorkbook(f);
	sh = w.getSheet("Sheet1");
	XSSFRow r = sh.getRow(row);
	XSSFCell c = r.getCell(col);
	int value = (int) c.getNumericCellValue();
			return String.valueOf(value);
	}
}
