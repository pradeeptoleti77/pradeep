package DataDriven;

public class DataDriven {

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI a=new ExcelAPI("C:\\Users\\prade\\Desktop\\testdata.xlsx");
		
	    String str = a.getCellData( "login", 0, 1);
	    System.out.println(str);
	}

}
