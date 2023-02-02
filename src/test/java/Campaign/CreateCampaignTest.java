package Campaign;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;
import Object_Repo.Campaigns_Page;
import Object_Repo.Home_Page;
import Object_Repo.ValidationAndVerificationPage;

public class CreateCampaignTest extends BaseClass {

	@Test ()
	public void createCamp() throws Throwable {
		
		// Generic Utilities Objects
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		
		// POM Pages Objects
		Home_Page hp = new Home_Page(driver);
		Campaigns_Page cp = new Campaigns_Page(driver);

		hp.moreDdAction(driver);
		hp.campaignsButtonClick();
		cp.createCampaignsButtonClick();
		
		//Creating a random number
		int ranNum = jlib.getRandomNum();
		//Getting Campaign data from excel
		String campaignName = elib.getExcelData("Campaign", 0, 0)+ranNum;
		
		cp.enterCampaignsName(campaignName);
		cp.saveButtonClick();
		
		// Validation
		ValidationAndVerificationPage validate  =new ValidationAndVerificationPage(driver);
		validate.validateCampaign(campaignName);

	}

}
