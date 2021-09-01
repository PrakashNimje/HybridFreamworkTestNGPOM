package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.CreateBusinessAccount;
import Com.Bitbatua.pageObject.CreateWallet;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_CreateWalletUSD_010 extends BaseClass {


	@Test
	public void CreateWalletUSD() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);	
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		CreateWallet CretWall =new CreateWallet(driver);

		CretWall.clickWallet();
		Thread.sleep(1000);
		logger.info("Clicking On Wallets");

		CretWall.clickCreateWallet();
		Thread.sleep(1000);
		logger.info("Clicking On Create Wallets");

		String WalletNmae=randomestring();
		CretWall.setWalletName(WalletNmae);
		Thread.sleep(1000);
		logger.info("Entered Wallets Name");

		CretWall.SearchCurrency();
		Thread.sleep(2000);

		CretWall.SelectUSD();;
		logger.info("Selected USD");

		CretWall.Done();
		logger.info("Successfully USD Wallets Created");

	}

}












