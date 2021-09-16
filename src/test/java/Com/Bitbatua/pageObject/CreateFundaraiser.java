package Com.Bitbatua.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateFundaraiser {

	WebDriver ldriver;

	public CreateFundaraiser(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using ="//span[normalize-space()='Fundraiser']")
	@CacheLookup
	WebElement lnkFundaraiser;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Fundraiser']")
	@CacheLookup
	WebElement lnkCreateFundaraiser;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement clickCombobox;

//	Medical NGO Other
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Medical']")
	WebElement clickMedical;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='NGO/charity']")
	WebElement clickNGO;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Other']")
	WebElement clickOther;
	
// Medical
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtPName;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	@CacheLookup
	WebElement clickCombobox2;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='India']")
	@CacheLookup
	WebElement SelIndia;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtHname;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtHAddress;


//	NGO
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtNGOName;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	@CacheLookup
	WebElement NGOCombobox;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='United States of America']")
	@CacheLookup
	WebElement NGOUSA;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement weblinktxt;
	
//	Other
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtOtherName;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement OtherCombobox;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Afghanistan']")
	@CacheLookup
	WebElement NGOAFGaN;
	
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[4]/button[1]/span[1]")
	@CacheLookup
	WebElement btnNext;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement btnNextNGO;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement btnNextOther;
	
	

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtFundDetails;


	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement SelectCurrency;


	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][normalize-space()='INR']")
	@CacheLookup
	WebElement SelectINR;
	
	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][normalize-space()='USD']")
	@CacheLookup
	WebElement SelectUSD;
	


	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtGoalAmunt;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-form-field[2]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[local-name()='svg'][1]")
	@CacheLookup
	WebElement SelectCale;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-form-field[3]/div[1]/div[1]/div[3]/mat-chip-list[1]/div[1]/input[1]")
	@CacheLookup
	WebElement textHastag;


	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-form-field[4]/div[1]/div[1]/div[3]/textarea[1]")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement btnNext2;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement upload;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/app-root[1]/app-createfundraiser[1]/div[1]/div[2]/div[1]/div[2]/form[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[3]/button[1]")
	@CacheLookup
	WebElement Submit;
	
	
	


	public void Fundaraiser() {
		lnkFundaraiser.click();
	}

	public void CreateaFundaraiser() {
		lnkCreateFundaraiser.click();

	}
//  ComboBox Medical NGO Other
	public void Combobox() {
		clickCombobox.click();
	}

	public void ComboboxNGO() {
		NGOCombobox.click();
	}
	
	
	public void ComboboxOther() {
		OtherCombobox.click();
	}
	
// Click to Medical NGO Other

	public void Medical() {
		clickMedical.click();
	}
	
	public void clickNGO() {
		clickNGO.click();
	}
	

	public void clickOther() {
		clickOther.click();
	}
		
//	Medical 1st Step
	public void PName(String Pname) {
		txtPName.sendKeys(Pname);
	}

	public void Combobox2() {
		clickCombobox2.click();
	}

	public void India() {
		SelIndia.click();
	}

	public void HName(String Hname) {
		txtHname.sendKeys(Hname);
	}

	public void HAddress(String HAddress) {
		txtHAddress.sendKeys(HAddress);
	}

//	NGO 1st Step	
	
	public void NGOName(String NGOName) {
		txtNGOName.sendKeys(NGOName);
	}
	
	public void NGOCombo() {
		NGOCombobox.click();
	}
	
	public void USA() {
		NGOUSA.click();
	}
	
	public void Website(String NGO) {
		weblinktxt.sendKeys(NGO);
	}
	
//	Other 1st Step	
	
	public void OtherName(String OName) {
		txtOtherName.sendKeys(OName);
	}
	
	public void Ocombo() {
		OtherCombobox.click();
	}
	
	public void AFGAN() {
		NGOAFGaN.click();
	}
	
	public void NextMedical() {
		btnNext.click();
	}
	
	public void NextOther() {
		btnNextOther.click();
	}

	public void NextNGO() {
		btnNextNGO.click();
	}

	
	public void FDetails(String FDetails) {
		txtFundDetails.sendKeys(FDetails);
	}

	public void Currency() {
		SelectCurrency.click();
	}

	public void INR() {
		SelectINR.click();
	}
	
	public void USD() {
		SelectUSD.click();
	}
	

	public void GoalAmunt(String GoalAmunt) {
		txtGoalAmunt.sendKeys(GoalAmunt);
	}

	public void Calender() {
		SelectCale.click();
	}

	public void HashTag(String Hashtag) {
		textHastag.sendKeys(Hashtag);
	}
		
		
    public void Description(String Description) {
    	txtDescription.sendKeys(Description);
    }
    
    public void Next2() {
    	btnNext2.click();
    }
    
    public void ImageUpload() {
    	upload.click();
    }
    
    public void Submit() {
    	Submit.click();
  
    }


		
	}
