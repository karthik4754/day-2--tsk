package datadrivenclasswork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class Sample {
	public static void main(String[] args) throws IOException {
		//location of my excel
		File f=new File("C:\\Users\\Karthik\\eclipse-workspace\\DataDriven\\excel\\data.xlsx");
		//to read the file 
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		//to get the sheet
		Sheet s=w.getSheet("Sheet1");
		//to get the number of row present in the sheet 
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);
		System.out.println("done completed");
		
		
		
	}

}
