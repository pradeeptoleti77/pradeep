package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteDataByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\prade\\Desktop\\testdata.xlsx" );
		FileOutputStream fos=null;
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("login");
		XSSFRow row=null;
		XSSFCell cell=null;
		XSSFFont font=wb.createFont();
		XSSFCellStyle style=wb.createCellStyle();
		
		row=sheet.getRow(3);
		cell=row.getCell(4);
		
		font.setFontName("Algerian");
		font.setBold(true);
		font.setFontHeight(14.0);
		
		style.setFont(font);
		
		cell.setCellStyle(style);
		cell.setCellValue("arifa");
		
		fos=new FileOutputStream("C:\\Users\\prade\\Desktop\\testdata.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		  fis.close();
	}

}
