package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwTB;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBTN;
	
	@FindBy(xpath ="//p[contains(@class,'content')]")
	private WebElement invalidMsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		loginBTN.click();
	}
	
	public boolean verifyErrMsgIsDisplayed(WebDriverWait wait)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(invalidMsg));
			Reporter.log("Invalid Msg is Displayed",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Invalid Msg is Not Displayed",true);
			return false;
		}
	}
}












