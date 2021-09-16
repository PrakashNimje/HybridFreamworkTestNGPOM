package Com.Bitbatua.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.Deposit;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_DepositTest_USDT extends BaseClass {

	@Test
	public void DepositUSDT() throws InterruptedException 
	{
		
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);	
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		Deposit Depo  =new Deposit (driver);
	
		Depo.Wallet();
		Thread.sleep(1000);
		logger.info("Clicking On Wallets");

		Depo.Search1("USDT");
		Thread.sleep(3000);
		logger.info("Entered USDT In Search Box");
		
		Depo.Deposit1();
		Thread.sleep(3000);
		logger.info("Clicking On Deposit");
		
		Depo.btnCopy();
		Thread.sleep(2000);
		logger.info("Copy Address");
		
		Depo.ViewWalletlist();
		Thread.sleep(1000);
		logger.info("Back to Wallets List");
		
		Depo.Search2("PrakashUSDT");
		Thread.sleep(3000);
		logger.info("Entered PrakashUSDT In Search Box");
		
		Depo.btnWithdraw();
		Thread.sleep(2000);
		logger.info("Click On Withdraw Button");
		
		
		Depo.Address("0x6D9a32C7C332D27B173Ec5a3F0ba9B88a0d2218e");
		Thread.sleep(2000);
		logger.info("Entered Address");
		
		Depo.Amount("0.5");
		Thread.sleep(2000);
		logger.info("Entered Ammount");
		
		js.executeScript("window.scrollBy(0,350)", "");
		
		Depo.Sendbtn();
		Thread.sleep(1000);
		logger.info("Click On Send Button");
		
		
	}
}
