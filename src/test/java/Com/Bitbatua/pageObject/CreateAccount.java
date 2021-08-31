package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

WebDriver ldriver;
	
	public CreateAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Create Account']")
	@CacheLookup
	WebElement lnkCreateAccount;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtFullName;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtEmail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement txtPasswrd;
	
	@FindBy(how = How.XPATH, using = "//span[@class='mat-checkbox-inner-container']")
	@CacheLookup
	WebElement rdIAgree;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Sign Up']")
	@CacheLookup
	WebElement btnSignUP;
	
	
	
	public void clickCreateAccount() {
		lnkCreateAccount.click();
			
	}

	public void FullName(String fname) {
		txtFullName.sendKeys(fname);
		
	}

	public void EmailAdd(String email) {
		txtEmail.sendKeys(email);
		
	}
	
	public void Password(String pass) {
		txtPasswrd.sendKeys(pass);
	}
	
	public void CheckBox() {
		rdIAgree.click();
			
	}
    
	public void SignUP() {
		btnSignUP.click();
			
	}
	
	
	
}
