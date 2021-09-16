package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CurrencySetting {

	
	WebDriver ldriver;

	public CurrencySetting(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//span[normalize-space()='Settings']")
	@CacheLookup
	WebElement lnkSetting;
	
	@FindBy(how = How.XPATH, using ="//a[@routerlink='currency-setting']")
	@CacheLookup
	WebElement lnkCurrencySetting;
	
	@FindBy(how = How.XPATH, using ="//mat-select[@role='combobox']//div//div//div")
	@CacheLookup
	WebElement Combobox;
	
	@FindBy(how = How.XPATH, using ="//mat-option[@role='option']//span[contains(text(),'INR')]")
	@CacheLookup
	WebElement SelINR;
	
	@FindBy(how = How.XPATH, using ="//span[normalize-space()='USD']")
	@CacheLookup
	WebElement SelUSD;
	
	@FindBy(how = How.XPATH, using ="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btnUpdate;
	
	public void Setting() {
		lnkSetting.click();
	}
	
	public void CurrencySettingg() {
		lnkCurrencySetting.click();
	}
	
	public void Combobox1() {
		Combobox.click();
	}
	
	public void SelINR() {
		SelINR.click();
	}
	
	public void SelUSD() {
		SelUSD.click();
	}
	
	public void Update() {
		btnUpdate.click();
	}
}
