package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Setting {

	WebDriver ldriver;

	public Setting(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//span[normalize-space()='Settings']")
	@CacheLookup
	WebElement lnkSetting;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Full Name']")
	@CacheLookup
	WebElement txtFullName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Address']")
	@CacheLookup
	WebElement txtAddress;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='City']")
	@CacheLookup
	WebElement txtcity;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='State']")
	@CacheLookup
	WebElement txtState;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Zip Code']")
	@CacheLookup
	WebElement txtZipCode;

	@FindBy(how = How.XPATH, using = "//mat-select[@placeholder='Country']//div//div//div")
	@CacheLookup
	WebElement Combobox;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='United States of America']")
	@CacheLookup
	WebElement Selcountry;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-profile[1]/div[1]/div[1]/div[1]/section[1]/div[1]/app-user-setting[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
	@CacheLookup
	WebElement btnupdate;
	
	public void Settingg() {
		lnkSetting.click();
	}
	
	public void FullName(String Fname) {
		txtFullName.clear();
		txtFullName.sendKeys(Fname);
	}
	
	public void Addresss(String Add) {
		txtAddress.clear();
		txtAddress.sendKeys(Add);
	}
	
	public void City(String city) {
		txtcity.clear();
		txtcity.sendKeys(city);
	}
	
	public void State(String State) {
		txtState.clear();
		txtState.sendKeys(State);
	}
	
	public void zipcode(String Zipcode) {
		txtZipCode.clear();
		txtZipCode.sendKeys(Zipcode);
	}
	
	public void Combobox() {
		Combobox.click();
	}
	
	public void Selcountry() {
		Selcountry.click();
	}
	
	public void btnupdate() {
		btnupdate.click();
	}
	
	
}





