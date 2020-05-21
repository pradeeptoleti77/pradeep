package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.global.covid19.BaseTest;

public class LoginPage extends BaseTest
{
	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email")WebElement customerEmail;
	@FindBy(id="passwd")WebElement customerPass;
	@FindBy(id="SubmitLogin")WebElement submit;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")WebElement errorText;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public void customerLogin() throws Exception 
	{
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(customerEmail));
		
		signIn.click();
		//Thread.sleep(3000);
		customerEmail.sendKeys("pradeeptoleti77@gmail.com");
		customerPass.sendKeys("xjkncxb");
		//submit.click();
		submit.click();
	}
	
	public String verifyText()
	{
		return errorText.getText();
		
	}

}
