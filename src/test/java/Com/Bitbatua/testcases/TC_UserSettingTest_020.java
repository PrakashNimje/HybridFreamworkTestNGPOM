package Com.Bitbatua.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.LoginPage;
import Com.Bitbatua.pageObject.Setting;

public class TC_UserSettingTest_020 extends BaseClass {

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

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		Setting Set  =new Setting (driver);
		
		Set.Settingg();
		Thread.sleep(1000);
		logger.info("Clicking On Setting");

		Set.FullName("Prakash P Nimje");
		Thread.sleep(3000);
		logger.info("Entered Prakash P Nimje In Full Name");
		
		Set.Addresss("Near Trimurty Square NIT Garden,Mumbai");
		Thread.sleep(3000);
		logger.info("Entered Near Trimurty Square NIT Garden,Mumbai In Address");
		
		Set.City("Mumbai");
		Thread.sleep(3000);
		logger.info("Entered Mumbai In city");
		
		Set.State("Maharastra");
		Thread.sleep(3000);
		logger.info("Entered Maharastra In State");
		
		Set.zipcode("441802");
		Thread.sleep(3000);
		logger.info("Entered 441802 In Zipcode");
		
		Set.Combobox();
		Thread.sleep(1000);
		logger.info("Clicking On Combobox");
		
		Set.Selcountry();
		Thread.sleep(1000);
		logger.info("Clicking On Countery");
		
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		
		Set.btnupdate();
		Thread.sleep(1000);
		logger.info("Clicking On Update");
	}
	
	
	
}
