package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {
		String[][] tabArray = null;
		
		
		FileInputStream ExcelFile = new FileInputStream(FilePath);
		// Access the required test data sheet
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		int startRow = 1;
		int startCol = 1;
		int ci, cj;
		int totalRows = ExcelWSheet.getLastRowNum();

		// you can write a function as well to get Column count
		int totalCols = 2;
		 //tabArray=new String[2][2];
		
		tabArray = new String[totalRows][totalCols];
		ci = 0;
		for (int i = startRow; i <= totalRows; i++, ci++) {
			cj = 0;
			for (int j = startCol; j <= totalCols; j++, cj++) {
				//tabArray[ci][cj] = getCellData(i, j);
			//System.out.println(ExcelWSheet.getRow(ci).getCell(cj));
				Cell = ExcelWSheet.getRow(ci).getCell(cj);
				//int dataType = Cell.getCellType();
				//System.out.println(System.out.println(tabArray[ci][cj]));
				
				
				tabArray[ci][cj]= Cell.getStringCellValue();
				//System.out.println(tabArray[ci][cj]);
				
				
			}
		}

		return (tabArray);
	}

	/*
	 * public static String getCellData(int RowNum, int ColNum) throws Exception {
	 * try {
	 * 
	 * 
	 * } catch (Exception e) { System.out.println(e.getMessage()); throw (e); } }
	 */

}
