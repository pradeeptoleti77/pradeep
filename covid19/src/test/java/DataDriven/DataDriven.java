package DataDriven;

public class DataDriven {

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI ex=new ExcelAPI("C:\\Users\\prade\\Desktop\\testdata.xlsx");
		
		String val = ex.getCellData("login", 3, 2);
		System.out.println(val);
	}

}
