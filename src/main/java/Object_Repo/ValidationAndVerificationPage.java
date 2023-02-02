package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationAndVerificationPage {

	//Initialization
		public ValidationAndVerificationPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		//Declaration	
		@FindBy(id="dtlview_Organization Name")
		private WebElement actualOrganizationData;
		
		@FindBy(id="dtlview_Campaign Name")
		private WebElement actualCampaignData;
		
		@FindBy(id="dtlview_Product Name")
		private WebElement actualProductData;


		// Getters Methods
		public WebElement getActualOrganizationData() {
			return actualOrganizationData;
		}

		public WebElement getActualCampaignData() {
			return actualCampaignData;
		}

		public WebElement getActualProductData() {
			return actualProductData;
		}
		
		// Business Logic
		
		public void validateOrganization(String expData)
		{
			String actData = actualOrganizationData.getText();
			Assert.assertEquals(actData, expData);
//			if(actData.contains(data))
//			{
//				System.out.println("Validation PASS");
//			}
//			else
//			{
//				System.out.println("Validation FAIL");
//			}
		}
		
		public void validateCampaign(String expData)
		{
			String actData = actualCampaignData.getText();
			Assert.assertEquals(actData, expData);
//			if(actData.contains(data))
//			{
//				System.out.println("Validation PASS");
//			}
//			else
//			{
//				System.out.println("Validation FAIL");
//			}
		}
		
		public void validateProduct(String expData)
		{
			String actData = actualProductData.getText();
			Assert.assertEquals(actData, expData);
//			if(actData.contains(data))
//			{
//				System.out.println("Validation PASS");
//			}
//			else
//			{
//				System.out.println("Validation FAIL");
//			}
		}
		
		
}
