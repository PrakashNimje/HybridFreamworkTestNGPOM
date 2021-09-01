package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateWallet {

	WebDriver ldriver;

	public CreateWallet(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Wallets']")
	@CacheLookup
	WebElement lnkWallet;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='+ Create Wallet']")
	@CacheLookup
	WebElement btnCreateWallet;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[2]/div[1]/div[1]/div[2]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtWalletName;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[2]/div[1]/div[1]/div[2]/form[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement SearchCurrency;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][normalize-space()='ETH']")
	@CacheLookup
	WebElement SelectETH;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='USD']")
	@CacheLookup
	WebElement SelectUSD;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][normalize-space()='INR']")
	@CacheLookup
	WebElement SelectINR;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][normalize-space()='BTC']")
	@CacheLookup
	WebElement SelectBTC;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='USDT']")
	@CacheLookup
	WebElement SelectUSDT;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Done']")
	@CacheLookup
	WebElement BtnDone;

	public void clickWallet()
	{
		lnkWallet.click();
	}

	public void clickCreateWallet()
	{
		btnCreateWallet.click();
	}

	public void setWalletName(String wname)
	{
		txtWalletName.sendKeys(wname);
	}

	public void SearchCurrency()
	{
		SearchCurrency.click();
	}

	public void SelectETH()
	{
		SelectETH.click();
	}

	public void SelectUSD()
	{
		SelectUSD.click();
	}

	public void SelectINR()
	{
		SelectINR.click();
	}

	public void SelectBTC()
	{
		SelectBTC.click();
	}

	public void SelectUSDT()
	{
		SelectUSDT.click();
	}

	public void Done()
	{
		BtnDone.click();
	}


}
