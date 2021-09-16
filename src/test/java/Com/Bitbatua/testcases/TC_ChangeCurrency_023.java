package Com.Bitbatua.testcases;

import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.CurrencySetting;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_ChangeCurrency_023 extends BaseClass {

	@Test
	public void UserSetting() throws InterruptedException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);	
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);
		
		CurrencySetting CS = new CurrencySetting(driver);
		
		CS.Setting();
		Thread.sleep(1000);
		logger.info("Clicking On Setting");
		
		CS.CurrencySettingg();
		Thread.sleep(1000);
		logger.info("Clicking On CurrencySetting");
		
		CS.Combobox1();
		Thread.sleep(1000);
		logger.info("Clicking On Combobox");
		
		CS.SelUSD();
		Thread.sleep(1000);
		logger.info("Select On USD");
		
		CS.Update();
		Thread.sleep(1000);
		logger.info("click On Update");
	}
	
	
	
	
	
}
