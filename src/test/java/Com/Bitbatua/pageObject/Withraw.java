package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Withraw {


	WebDriver ldriver;

	public Withraw(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Wallets']")
	@CacheLookup
	WebElement lnkWallet;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/input[1]")
	@CacheLookup
	WebElement txtSearch1;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[4]/button[2]")
	@CacheLookup
	WebElement btnWithdraw;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtAdd1;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtAmunt1;
	
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Send']")
	@CacheLookup
	WebElement btnSend;


	public void Wallet() {
		lnkWallet.click();
	}
	
	public void Search1(String Sname) {
		txtSearch1.sendKeys(Sname);
	}
	
	public void Withdraw() {
		btnWithdraw.click();
	}
	
	public void Address(String Address) {
		txtAdd1.sendKeys(Address);
	}
	
	public void Ammount(String Amount) {
		txtAmunt1.sendKeys(Amount);
	}
	
	public void Sendbtn() {
		btnSend.click();

	}
}
