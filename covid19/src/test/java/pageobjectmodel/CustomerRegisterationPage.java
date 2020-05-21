package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.global.covid19.BaseTest;

public class CustomerRegisterationPage extends BaseTest
{
	//WebDriver driver;
	
	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email_create")WebElement newCustomerMail;
	@FindBy(id="SubmitCreate")WebElement createNewAccount;
	@FindBy(id="id_gender1")WebElement selectTitle;
	@FindBy(id="customer_firstname")WebElement customerFirstName;
	@FindBy(id="customer_lastname")WebElement customerLastName;
	//@FindBy(id="email")WebElement newEmail;
	@FindBy(id="passwd")WebElement newPassword;
	@FindBy(id="days")WebElement dayDropdown;
	@FindBy(id="months")WebElement monthDropdown;
	@FindBy(id="years")WebElement yearDropdown;
	@FindBy(id="optin")WebElement checkBox;
	//@FindBy(id="firstname")WebElement adressFirstName;
	//@FindBy(id="lastname")WebElement adressLasttName;
	@FindBy(id="company")WebElement companyName;
	@FindBy(id="address1")WebElement addressLine1;
	@FindBy(id="address2")WebElement addressLine2;
	@FindBy(id="city")WebElement city;
	@FindBy(id="id_state")WebElement state;
	@FindBy(id="postcode")WebElement postcode;
	@FindBy(id="id_country")WebElement country;
	@FindBy(id="phone_mobile")WebElement phoneNumber;
	@FindBy(id="alias")WebElement futureAddress;
	@FindBy(id="submitAccount")WebElement submit;
	
	public CustomerRegisterationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerDetails() throws Exception
	{
		signIn.click();
		
		//WebDriverWait wait=new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(newCustomerMail));
		//Thread.sleep(2000);
		waitforElement(60,newCustomerMail);
		
		//newCustomerMail.sendKeys("sagjj2sad@gmail.com");
		newCustomerMail.sendKeys(p.getProperty("fname")+p.getProperty("lname")+randomNum()+p.getProperty("domain"));
		String text = newCustomerMail.getAttribute("value");
		System.out.println(text);
		
		createNewAccount.click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(selectTitle));
		//Thread.sleep(3000);
		waitforElement(60,selectTitle);
		
		selectTitle.click();
		
		waitforElement(10, customerFirstName);
		
		customerFirstName.sendKeys("pradeep");
		customerLastName.sendKeys("toleti");
		//newEmail.sendKeys("sadnsad@gmail.com");
		newPassword.sendKeys("123456r");
		Thread.sleep(2000);
		dayDropdown.sendKeys("7");
		monthDropdown.sendKeys("September");
		yearDropdown.sendKeys("1997");
		checkBox.click();
		//adressFirstName.sendKeys("pradeep");
		//adressLasttName.sendKeys("toleti");
		companyName.sendKeys("Hakuna matata");
		addressLine1.sendKeys("Kphb");
		addressLine2.sendKeys("road no.3");
		city.sendKeys("Hyderabad");
		Thread.sleep(2000);
		state.sendKeys("Florida");
		postcode.sendKeys("50007");
		country.sendKeys("United States");
		phoneNumber.sendKeys("1234456789");
		futureAddress.sendKeys("Hyderabad");
		//submit.click();	
	}
}
