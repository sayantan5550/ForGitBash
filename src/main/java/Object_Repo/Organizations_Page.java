package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations_Page {
	//Initialization
		public Organizations_Page(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		// Declaration
		@FindBy(xpath="//img[@title='Create Organization...']")
		private WebElement createOrganizationButton;

		// Getters Method
		public WebElement getCreateOrganizationButton() {
			return createOrganizationButton;
		}
		
		//Business Logic
		public void createOrganizationButtonClick()
		{
			createOrganizationButton.click();
		}
		
		// Declaration
		@FindBy(name="accountname")
		private WebElement organizationName;
		
		@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
		private WebElement saveButton;

		// Getters Method
		public WebElement getOrganizationName() {
			return organizationName;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		// Business Logic
		public void enterOrganizationName(String orgName)
		{
			organizationName.sendKeys(orgName);
		}
		public void saveButtonClick()
		{
			saveButton.click();
		}
		

}
