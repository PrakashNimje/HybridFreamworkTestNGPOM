package Com.Bitbatua.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Bitbatua.pageObject.CreateFundaraiser;
import Com.Bitbatua.pageObject.LoginPage;

public class TC_CreateFundaraiser_013 extends BaseClass {

	@Test
	public void CreateFundaraiserNGO() throws IOException, InterruptedException, FindFailed
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);	
		lp.clickLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		CreateFundaraiser CreatFun  =new CreateFundaraiser(driver);

		CreatFun.Fundaraiser();
		Thread.sleep(1000);
		logger.info("Clicking On Fundaraiser");


		CreatFun.CreateaFundaraiser();
		Thread.sleep(1000);
		logger.info("Clicking On CreateFundaraiser");

		CreatFun.Combobox();
		Thread.sleep(1000);

		CreatFun.clickNGO();
		Thread.sleep(1000);
		logger.info("Select NGO As Cause");

		CreatFun.NGOName("Prakash Foundation");
		Thread.sleep(1000);
		logger.info("Entered NGO/Charity Name");

		CreatFun.ComboboxNGO();
		Thread.sleep(1000);

		CreatFun.USA();
		Thread.sleep(1000);
		logger.info("Selected USA As Country Name");


		CreatFun.Website("www.Prakash.com");
		Thread.sleep(1000);
		logger.info("Entered website Name");

		CreatFun.NextNGO();
		Thread.sleep(1000);
		logger.info("First Step Completed");
		
		if(driver.getTitle().equals("Fundraising Details"))
		{
			Assert.assertTrue(true);
			logger.info("1st Step Completed");
		}

		else
		{
			captureScreen(driver,"CreateFundaraiserNGO");
			Assert.assertTrue(false);
			logger.info("Failed 1st Step");
		}
		

		CreatFun.FDetails("Help Us Save The Gems Of Our Society");
		Thread.sleep(1000);
		logger.info("Entered Fundaraiser Details");

		CreatFun.Currency();
		Thread.sleep(1000);

		CreatFun.USD();
		Thread.sleep(1000);

		CreatFun.GoalAmunt("100");
		Thread.sleep(1000);
		logger.info("Entered Goal Ammount");

		CreatFun.Calender();
		Thread.sleep(2000);

		//To Select Month
		Screen s1 = new Screen();
		Pattern RA1 = new Pattern("RA1.PNG");
		s1.wait(RA1,2000);
		s1.click();

		//To Select Date
		Screen s2 = new Screen();
		Pattern RA2 = new Pattern("RA2.PNG");
		s2.wait(RA2,2000);
		s2.click();
		logger.info("Fundaraiser Ending Date Selected");
		Thread.sleep(2000);

		CreatFun.HashTag("#NGO");
		Thread.sleep(1000);
		logger.info("Hastag Entered.");

		CreatFun.Description("We are extremely grateful for all the help and support given by you towards supporting this cause.");

		Thread.sleep(3000);
		logger.info("Description Entered.");

		js.executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		CreatFun.Next2();
		logger.info("Second Step Completed");
		Thread.sleep(2000);
		
		if(driver.getTitle().equals("Fundraising Documents"))
		{
			Assert.assertTrue(true);
			logger.info("2nd Step Completed");
		}

		else
		{
			captureScreen(driver,"CreateFundaraiserNGO");
			Assert.assertTrue(false);
			logger.info("Failed 2st Step");
		}
		

		CreatFun.ImageUpload();
		logger.info("Image Upload Open");
		Thread.sleep(2000);

		//To Click On Desktop
		Screen s5 = new Screen();
		Pattern RA5 = new Pattern("RA5.PNG");
		s5.wait(RA5,2000);
		s5.click();	

		//To click On JPG  Folder
		Screen s6 = new Screen();
		Pattern RA6 = new Pattern("RA6.PNG");
		s6.wait(RA6,2000);
		s6.doubleClick();	

		//To click On Image  
		Thread.sleep(2000);
		Screen s7 = new Screen();
		Pattern RA7 = new Pattern("RA7.2.PNG");
		s7.wait(RA7,2000);
		s7.click();	

		//To click On Open  
		Thread.sleep(2000);
		Screen s8 = new Screen();
		Pattern RA8 = new Pattern("RA8.PNG");
		s8.wait(RA8,2000);
		s8.click();	
		Thread.sleep(2000);
		logger.info("Successfully Image Upload");

		CreatFun.Submit();
		logger.info("Successfully Created Fundaraiser");
		Thread.sleep(2000);
        
		if(driver.getTitle().equals("All Fundraisers"))
		{
			Assert.assertTrue(true);
			logger.info("Successfully Created Fundaraiser");
		}

		else
		{
			captureScreen(driver,"CreateFundaraiserNGO");
			Assert.assertTrue(false);
			logger.info("Failed to Create Fundaraiser");
		}
		
		
		
	}	

}
