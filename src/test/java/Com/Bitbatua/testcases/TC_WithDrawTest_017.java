package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.LoginPage;
import Com.Bitbatua.pageObject.Withraw;

public class TC_WithDrawTest_017 extends BaseClass {

	@Test
	public void WithrawBTC() throws IOException, InterruptedException, FindFailed
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);	
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		Withraw With  =new Withraw (driver);
	
		With.Wallet();
		Thread.sleep(1000);
		logger.info("Clicking On Wallets");

		With.Search1("Prakashhh");
		Thread.sleep(3000);
		logger.info("Entered Prakashhh In Search Box");
		
		With.Withdraw();
		Thread.sleep(3000);
		logger.info("Clicking On Withdraw");
		
//		js.executeScript("window.scrollBy(0,350)", "");
		
		
		With.Address("tb1q029a5hhkgzsv8404as4c9qp55s4dhldv83v36u");
		Thread.sleep(3000);
		logger.info("Entered Address");
		
		With.Ammount("0.00001");
		Thread.sleep(3000);
		logger.info("Entered Ammount");
		
		
		js.executeScript("window.scrollBy(0,350)", "");
		
		With.Sendbtn();
		Thread.sleep(1000);
		logger.info("Click On Send Button");
	
	}
}
