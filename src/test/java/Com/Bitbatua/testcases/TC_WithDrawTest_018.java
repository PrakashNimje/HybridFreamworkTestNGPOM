package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.Deposit;
import Com.Bitbatua.pageObject.LoginPage;
import Com.Bitbatua.pageObject.Withraw;

public class TC_WithDrawTest_018 extends BaseClass {

	@Test
	public void WithrawETH() throws IOException, InterruptedException, FindFailed
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

		With.Search1("RamETH");
		Thread.sleep(3000);
		logger.info("Entered RamETH In Search Box");
		
		With.Withdraw();
		Thread.sleep(3000);
		logger.info("Clicking On Withdraw");
		
//		js.executeScript("window.scrollBy(0,350)", "");
		
		
		With.Address("0x71b1bE18B505a3D2eF0673Fed0bc69E4b86b43fF");
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
