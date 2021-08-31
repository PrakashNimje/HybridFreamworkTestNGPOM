package Com.Bitbatua.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.CreateAccount;

public class TC_CreateAccntTest_003 extends BaseClass
{

	@Test
	public void CreateAccountTest() throws IOException, InterruptedException
	{
		driver.get(baseURL);

		logger.info("URL is opened");

		CreateAccount CA=new CreateAccount(driver);	

		CA.clickCreateAccount();
		logger.info("Clicked On SignUP");

		CA.FullName("Prakash Nimje");
		logger.info("Entered Full Name");

		String email=randomestring()+"@gmail.com";
		CA.EmailAdd(email);
		logger.info("Entered Email Address");
        Thread.sleep(2000);
		
		CA.Password("Prakash@12");
		logger.info("Entered Password");

		CA.CheckBox();
		logger.info("Click on Checkbox");

		CA.SignUP();
		logger.info("Click On SignUP");

		Thread.sleep(3000);

//		logger.info("validation started....");
//
//		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
//
//		if(res==true)
//		{
//			Assert.assertTrue(true);
//			logger.info("test case passed....");
//
//		}
//		else
//		{
//			logger.info("test case failed....");
//			captureScreen(driver,"CreateAccountTest");
//			Assert.assertTrue(false);
//		}
	}
		
			
}