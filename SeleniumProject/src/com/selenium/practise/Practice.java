package com.selenium.practise;

public class Practice extends JustPractice
{

	public static void main(String[] args) throws Exception 
	{
		init();
		openBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		selectDropDown("selectDropdown_id","dropdowninput");
		enterTextFiled("field-keywords","jack sparrow");
		searchElement("nav-input");
	}

	

	

	

	

}
