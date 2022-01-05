package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.get(baseURL);

		logger.info("URL is opened");

		LoginPage lp=new LoginPage(driver);	

		lp.clickLogin();
		logger.info("Clicked On Login");

		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();
        
		Thread.sleep(3000);
		
//		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
//                .contains("Login Successfully"));
		
		if(driver.findElement(By.tagName("body")).getText().contains("Login Successfully "))
		{
		  Assert.assertTrue(true);
		  logger.info("Login test passed");
     	}
		
		else
 		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
 		}
	}
}
	
		
//////		if(driver.getTitle().equals("DashBoard Page"))
//////		{
//////			Assert.assertTrue(true);
//////			logger.info("Login test passed");
//////		}
//////
//////		else
//////		{
//////			captureScreen(driver,"loginTest");
//////			Assert.assertTrue(false);
//////			logger.info("Login test failed");
////		}
//	}
//
//}
