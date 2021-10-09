package MavenExample;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExcelread {
	
	XSSFSheet sheet;

	MavenExcelread() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Karthik\\Desktop\\Book1.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(file);
		sheet = wk.getSheet("Sheet2");
	}
	
	public double readdata(int a, int b)
	{
		Row r=sheet.getRow(a);
		Cell c=r.getCell(b);
		return c.getNumericCellValue();
		
	}
	public static void main(String args[]) throws IOException
	{
		MavenExcelread m = new MavenExcelread();
		double x=m.readdata(2, 1);
		System.out.println(x);
	}
}
