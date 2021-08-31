package Com.Bitbatua.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.ForgotPassword;

public class TC_ForgotPassTest_004 extends BaseClass {

	@Test
	public void ForgotPassTest() throws IOException, InterruptedException
	{
		driver.get(baseURL);

		logger.info("URL is opened");

		ForgotPassword FA=new ForgotPassword(driver);	

		FA.clickLogin();
		logger.info("Clicked On Login");

		FA.clickForgotPassword();
		logger.info("Clicked On Forgot Password");

		FA.EnterEmail("prakashnimje800@gmail.com");
		logger.info("Entered Email Address");

		FA.clickSendOTP();
		logger.info("Clicked On Send OTP");


	}

}
