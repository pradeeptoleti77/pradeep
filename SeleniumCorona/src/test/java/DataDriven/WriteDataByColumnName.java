package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\prade\\Desktop\\testdata.xlsx");
		FileOutputStream fos=null;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("login");
				
		XSSFRow row=null;
		XSSFCell cell=null;
		
		int collNum = -1;
		row=sheet.getRow(0);
		
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Password"))
			{
				collNum=i;
			}
		}
		
		row=sheet.getRow(2);
		cell=row.getCell(collNum);
		
		cell.setCellValue("aborted");
		
		fos=new FileOutputStream("C:\\Users\\prade\\Desktop\\testdata.xlsx");
		wb.write(fos);
		
		wb.close();
		fos.close();
		fis.close();
		
	}

}
