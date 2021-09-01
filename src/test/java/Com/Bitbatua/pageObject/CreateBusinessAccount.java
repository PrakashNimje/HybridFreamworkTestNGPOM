package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateBusinessAccount {

	WebDriver ldriver;

	public CreateBusinessAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Create a Business Account']")
	@CacheLookup
	WebElement lnkCreateBusinessAccount;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtBusinessName;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtBusinessEmail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[3]/div[1]/div[1]/div[3]/input[1]")
	WebElement txtAddress;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[4]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement BusinessDroupDown;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][normalize-space()='NGO']")
	@CacheLookup
	WebElement SelectNGO;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='STORE']")
	@CacheLookup
	WebElement SelectStore;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[5]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	@CacheLookup
	WebElement CountryDroupDown;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='India']")
	@CacheLookup
	WebElement SelectIndia;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[6]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement httpDroupDown;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='http://']")
	@CacheLookup
	WebElement Selecthttp;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[7]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtwebsiteName;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-checkbox-inner-container']")
	@CacheLookup
	WebElement clickcheckbox;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-account[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement btnAddAccount;


	public void CreateABusinessAccount() {
		lnkCreateBusinessAccount.click();

	}

	public void BusinessName(String Bname) {
		txtBusinessName.sendKeys(Bname);

	}

	public void BusinessEmail(String Bemail) {
		txtBusinessEmail.sendKeys(Bemail);

	}

	public void Address(String Add) {
		txtAddress.sendKeys(Add);
	}

	public void BusinessDroupDown() {
		BusinessDroupDown.click();

	}
	public void SelectNGO() {
		SelectNGO.click();

	}
	public void SelectStore() {
		SelectStore.click();

	}
	public void CopuntryDroupDown() {
		CountryDroupDown.click();
	}

	public void India() {
		SelectIndia.click();
	}

	public void httpDroupDown() {
		httpDroupDown.click();	
	}

	public void Selecthttp() {
		Selecthttp.click();
	}
	public void WebName(String webname) {
		txtwebsiteName.sendKeys(webname);
	}

	public void checkbox() {
		clickcheckbox.click();

	}

	public void ADDAccount() {
		btnAddAccount.click();

	}



}
