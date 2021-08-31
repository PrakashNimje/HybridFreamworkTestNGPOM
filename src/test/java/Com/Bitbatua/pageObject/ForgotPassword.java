package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {


	WebDriver ldriver;

	public ForgotPassword(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement lnkLogin;
	
	@FindBy(linkText="Forgot Password?")
	@CacheLookup
	WebElement lnkForgotPass;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-forget-password[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement EnterEmail;

	@FindBy(xpath="//button[normalize-space()='Send OTP']")
	@CacheLookup
	WebElement SendOTP;
	
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void clickForgotPassword()
	{
		lnkForgotPass.click();
	}
	
	public void EnterEmail(String Email)
	{
		EnterEmail.sendKeys(Email);
	}
	
	public void clickSendOTP()
	{
		SendOTP.click();
	}	
	
	

}
