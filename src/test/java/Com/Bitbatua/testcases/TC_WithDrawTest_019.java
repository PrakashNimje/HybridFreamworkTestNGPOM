package Com.Bitbatua.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.LoginPage;
import Com.Bitbatua.pageObject.Withraw;

public class TC_WithDrawTest_019 extends BaseClass {

	
	@Test
	public void WithrawETH() throws InterruptedException
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

		With.Search1("USDT");
		Thread.sleep(3000);
		logger.info("Entered USDT In Search Box");
		
		With.Withdraw();
		Thread.sleep(3000);
		logger.info("Clicking On Withdraw");
	
		With.Address("0x0bb52A6398a7b9490A17E26620897653Ee11696A");
		Thread.sleep(3000);
		logger.info("Entered Address");
		
		With.Ammount("0.5");
		Thread.sleep(3000);
		logger.info("Entered Ammount");
		
		
		js.executeScript("window.scrollBy(0,350)", "");
		
		With.Sendbtn();
		Thread.sleep(1000);
		logger.info("Click On Send Button");
		
		
	}
	
}
