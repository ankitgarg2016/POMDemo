package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods  {

	public static WebDriver driver;
	
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
		    int ci,cj;
		    int totalRows = ExcelWSheet.getLastRowNum();
		 
		    // you can write a function as well to get Column count
		    int totalCols = 2;
		   // tabArray=new String[2][2];
		    tabArray=new String[totalRows][totalCols];
		    ci=0;
		    for (int i=startRow;i<=totalRows;i++, ci++) 
		    {              
		    	cj=0;
		    	for (int j=startCol;j<=totalCols;j++, cj++)
		    	{
			    		tabArray[ci][cj]=getCellData(i,j);
			    		System.out.println(tabArray[ci][cj]);  
		    	}
		    }

		 
			
		 return(tabArray);
		 }
	 
	 
	 public static String getCellData(int RowNum, int ColNum) throws Exception {
		 try{
			 Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			 int dataType = Cell.getCellType();
			 
			 if  (dataType == 3) {
			 return "";
			 }
			 else{
			 String CellData = Cell.getStringCellValue();
			 return CellData;
			 }
		 }
		 catch (Exception e){
			 System.out.println(e.getMessage());
			 throw (e);
		 }
	 }
	 
	
	
	
	
	
	public static String getProperties(String key) throws IOException {
		
		System.out.println(System.getProperty("xyz"));

		File file = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\Goibibo"+System.getProperty("xyz")+".properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fileInput);
		String x = pro.getProperty(key);
		return x;
	}

	public void click(WebElement element) {
		
		element.click();
	}


	public static void setExcelFile(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
