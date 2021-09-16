package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Deposit {

	
	WebDriver ldriver;

	public Deposit(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Wallets']")
	@CacheLookup
	WebElement lnkWallet;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/input[1]")
	@CacheLookup
	WebElement txtSearch1;

	@FindBy(how = How.XPATH, using = "//mat-icon[normalize-space()='call_received']")
	@CacheLookup
	WebElement btnDeposit;
	
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/mat-icon[1]")
	@CacheLookup
	WebElement btnCopy;
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement btnViewWalletlist;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/input[1]")
	@CacheLookup
	WebElement txtSearch2;
	
	@FindBy(how = How.XPATH, using = "//mat-icon[contains(text(),'call_made')]")
	@CacheLookup
	WebElement btnWithdraw;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtAddresss;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtAmt;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send')]")
	@CacheLookup
	WebElement btnSend;
	
	
	public void Wallet() {
		lnkWallet.click();
	}
	
	public void Search1(String Sname) {
		txtSearch1.sendKeys(Sname);
	}
	
	public void Deposit1() {
		btnDeposit.click();
	}
	
	public void btnCopy() {
		btnCopy.click();
	}
	
	public void ViewWalletlist() {
		btnViewWalletlist.click();
	}
	
	public void Search2(String Sname) {
		txtSearch2.sendKeys(Sname);
	}
	
	public void btnWithdraw() {
		btnWithdraw.click();
	}
	
	public void Address(String Address) {
		txtAddresss.sendKeys(Address);
	}
	
	public void Amount(String amount) {
		txtAmt.sendKeys(amount);
	}
	
	public void Sendbtn() {
		btnSend.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
