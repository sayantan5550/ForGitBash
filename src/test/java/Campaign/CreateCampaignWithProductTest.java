package Campaign;

import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import Object_Repo.Campaigns_Page;
import Object_Repo.Home_Page;
import Object_Repo.Product_Page;
import Object_Repo.Search_Products_Page;
import Object_Repo.ValidationAndVerificationPage;

public class CreateCampaignWithProductTest extends BaseClass {
	
	@Test()
	public void campWithProd() throws Throwable {
		
		// Generic Utilities Objects
		WebDriver_Utility wlib = new WebDriver_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		
		// POM Pages Objects
		Home_Page hp = new Home_Page(driver);
		Product_Page pp = new Product_Page(driver);
		Campaigns_Page cp = new Campaigns_Page(driver);
		Search_Products_Page spp = new Search_Products_Page(driver);
		
		hp.productButtonClick();
		pp.createProductButtonClick();
		
		//Creating a random number
		int ranNum = jlib.getRandomNum();
		//Getting Product data from excel
		String productName = elib.getExcelData("Product", 0, 0)+ranNum;

		pp.enterProductName(productName);
		pp.saveButtonClick();
	 
		hp.moreDdAction(driver);
		hp.campaignsButtonClick();
		cp.createCampaignsButtonClick();
		
		//Getting Campaign data from excel
		String campaignName = elib.getExcelData("Campaign", 0, 0)+ranNum;
		
		Thread.sleep(2000);
		
		cp.enterCampaignsName(campaignName);	
		cp.selectProductClick();
		
		// Swith window to "Products&action"
		wlib.switchToWindow(driver, "Products&action");
		
		spp.searchText(productName);
		spp.searchButtonClick();
		spp.productSelectedClick(driver, productName);

		// Switch back to "Campaigns&action"
		wlib.switchToWindow(driver, "Campaigns&action");
		
		cp.saveButtonClick();
		
		// Validation

		ValidationAndVerificationPage validate  =new ValidationAndVerificationPage(driver);
		validate.validateCampaign(campaignName);

	}

}
