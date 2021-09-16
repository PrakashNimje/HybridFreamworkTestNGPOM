package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.Deposit;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_DepositTest_015 extends BaseClass {

	@Test
	public void DepositBTC() throws IOException, InterruptedException, FindFailed
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

		Depo.Search1("Prakashhh");
		Thread.sleep(3000);
		logger.info("Entered Prakashhh In Search Box");
		
		Depo.Deposit1();
		Thread.sleep(3000);
		logger.info("Clicking On Deposit");
		
//		js.executeScript("window.scrollBy(0,350)", "");
		
		Depo.btnCopy();
		Thread.sleep(2000);
		logger.info("Copy Address");
		
		Depo.ViewWalletlist();
		Thread.sleep(1000);
		logger.info("Back to Wallets List");
		
		Depo.Search2("PrakashBTC");
		Thread.sleep(3000);
		logger.info("Entered PrakashBTC In Search Box");
		
		Depo.btnWithdraw();
		Thread.sleep(2000);
		logger.info("Click On Withdraw Button");
		
		
		Depo.Address("tb1qn0yhs30ydwctt6sgewhwt3qpu5ht8hnz75apsp");
		Thread.sleep(2000);
		logger.info("Entered Address");
		
		Depo.Amount("0.00001");
		Thread.sleep(2000);
		logger.info("Entered Ammount");
		
		js.executeScript("window.scrollBy(0,350)", "");
		
		Depo.Sendbtn();
		Thread.sleep(1000);
		logger.info("Click On Send Button");
	
	}
	
	
}
