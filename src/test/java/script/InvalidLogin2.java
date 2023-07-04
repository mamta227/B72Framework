package script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import generic.Util;
import page.LoginPage;

public class InvalidLogin2 extends BaseTest {
	
	@DataProvider
	public void getData()
	{
		Util.getDataFromCSVtoArray("./data/invalidLogin.csv");
	}
	@Test(priority = 3, dataProvider="getData")
	public void testInvalidLogin(String un,String pw)
	{
		
	//		1. enter invalid un
			LoginPage loginPage=new LoginPage(driver);
			loginPage.setUserName(un);
	//		2. enter invalid pw
			loginPage.setPassword(pw);
	//		3. click login button
			loginPage.clickLoginButton();
	//		4. err msg should be displayed
			boolean result = loginPage.verifyErrMsgIsDisplayed(wait);
			Assert.assertTrue(result);
		}
	}

}
