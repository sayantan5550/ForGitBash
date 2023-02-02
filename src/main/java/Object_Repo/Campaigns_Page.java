package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigns_Page {
	//Initialization
		public Campaigns_Page(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		// Declaration
		@FindBy(xpath="//img[@alt='Create Campaign...']")
		private WebElement createCampaignsButton;

		// Getters Method
		public WebElement getCreateCampaignsButton() {
			return createCampaignsButton;
		}
		
		// Business Logic
		public void createCampaignsButtonClick()
		{
			createCampaignsButton.click();
		}
		
		// Declaration
				@FindBy(name="campaignname")
				private WebElement campaignsName;
				
				@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
				private WebElement saveButton;
				
				@FindBy(xpath="//img[@title='Select']")
				private WebElement selectProduct;

				// Getters Method
				public WebElement getCampaignsName() {
					return campaignsName;
				}

				public WebElement getSaveButton() {
					return saveButton;
				}
				
				public WebElement getSelectProduct()
				{
					return selectProduct;
				}
				
				// Business Logic
				public void enterCampaignsName(String campaignName)
				{
					campaignsName.sendKeys(campaignName);
				}
				public void saveButtonClick()
				{
					saveButton.click();
				}
				public void selectProductClick()
				{
					selectProduct.click();
				}

}
