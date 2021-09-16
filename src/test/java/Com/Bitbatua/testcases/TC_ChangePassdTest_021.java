package Com.Bitbatua.testcases;

import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.ChangePassword;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_ChangePassdTest_021 extends BaseClass {

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
	
		ChangePassword CP  =new ChangePassword (driver);
		
		CP.Settingg();
		Thread.sleep(1000);
		logger.info("Clicking On Setting");
		
		
		CP.ChangePwd();
		Thread.sleep(1000);
		logger.info("Clicking On Change Password");
		
		
		CP.CurrentPWD("Prakash@1");
		Thread.sleep(1000);
		logger.info("Entered Current Password");
		
		CP.NEWPWD("Prakash@1");
		Thread.sleep(1000);
		logger.info("Entered NEW Password");
		
		CP.btnchangepass();
		Thread.sleep(1000);
		logger.info("Click ON Change Pass Button");
}
}
