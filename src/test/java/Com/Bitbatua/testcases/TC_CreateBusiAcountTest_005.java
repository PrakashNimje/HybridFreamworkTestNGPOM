package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.CreateBusinessAccount;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_CreateBusiAcountTest_005 extends BaseClass {

	
	@Test
	public void CreateBusinessAccounttTestNGO() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);	
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
	
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
	    CreateBusinessAccount BusinAcct =new CreateBusinessAccount(driver);
	
	    BusinAcct.CreateABusinessAccount();
	    logger.info("Clicked On Create Business Account");
	    
	    String BusiNmae=randomestring();
	    BusinAcct.BusinessName(BusiNmae);
	    logger.info("Entered Business Name");
	    BusinAcct.BusinessEmail("prakashnimje800@gmail.com");
	    logger.info("Entered Email Address");
	    BusinAcct.Address("Near GTN Nagar, Univercity Delhi,Pin:441802");
	    logger.info("Entered Address");
	    BusinAcct.BusinessDroupDown();
	    BusinAcct.SelectNGO();
	    Thread.sleep(2000);
	    logger.info("Click on NGO as Nature of Business");	   
	    BusinAcct.CopuntryDroupDown();
	    Thread.sleep(2000);	 
	    BusinAcct.India();
	    Thread.sleep(2000);
	    logger.info("Click on India as Country");	
	    js.executeScript("window.scrollBy(0,350)", "");
	    Thread.sleep(2000);
	    BusinAcct.httpDroupDown();
	    BusinAcct.Selecthttp();
	    String WebsiteName=randomestring()+".com";
	    BusinAcct.WebName(WebsiteName);
	    logger.info("Entered Website Name");
	    BusinAcct.checkbox();
	    logger.info("Select On Checkbox");
	    BusinAcct.ADDAccount();
	    logger.info("Click On Add Account Button");
	    Thread.sleep(5000);

		logger.info("validation started....");

		boolean res=driver.getTitle().contains("Business Confirmation Page");

		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");

		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"CreateBusinessAccounttTestNGO");
			Assert.assertTrue(false);
		}

	}
	
}
