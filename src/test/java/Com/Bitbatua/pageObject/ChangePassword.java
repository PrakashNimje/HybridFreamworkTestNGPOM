package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {

	WebDriver ldriver;

	public ChangePassword(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//span[normalize-space()='Settings']")
	@CacheLookup
	WebElement lnkSetting;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Change Password')]")
	@CacheLookup
	WebElement lnkchangePassword;
	
	@FindBy(how = How.XPATH, using ="//input[@placeholder='Current Password']")
	@CacheLookup
	WebElement txtCurrentPassword;
	
	@FindBy(how = How.XPATH, using ="//input[@placeholder='New Password']")
	@CacheLookup
	WebElement txtNewPassword;
	
	@FindBy(how = How.XPATH, using ="//button[normalize-space()='Change Password']")
	@CacheLookup
	WebElement btnchangepass;
	
	public void Settingg() {
		lnkSetting.click();
	}
	
	public void ChangePwd() {
		lnkchangePassword.click();
	}
	
	public void CurrentPWD(String CPWD) {
		txtCurrentPassword.sendKeys(CPWD);
	}
	
	public void NEWPWD(String NPWD) {
		txtNewPassword.sendKeys(NPWD);
	}
	
	public void btnchangepass() {
		btnchangepass.click();
	}
}
