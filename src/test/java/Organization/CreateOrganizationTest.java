package Organization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;
import Object_Repo.Home_Page;
import Object_Repo.Organizations_Page;
import Object_Repo.ValidationAndVerificationPage;

@Listeners(Generic_Utility.ListenersClass.class)
public class CreateOrganizationTest extends BaseClass {

	@Test()
	public void createOrg() throws Throwable {
		
		// Generic Utilities Objects
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
			
		// POM Pages Objects
		Home_Page hp = new Home_Page(driver);
		Organizations_Page op = new Organizations_Page(driver);

		hp.organizationButtonClick();
		op.createOrganizationButtonClick();

		// Creating Random Number
		int ranNum = jlib.getRandomNum();
		
		// Calling Data from Excel_Utility
		String orgName = elib.getExcelData("Organization",0,0)+ranNum;
		
		op.enterOrganizationName(orgName);
		op.saveButtonClick();
	
		// Validation
		
		ValidationAndVerificationPage validate  =new ValidationAndVerificationPage(driver);
//		validate.validateOrganization(orgName);
		
//		 To fail the test case intentionally
		validate.validateOrganization("organization name");

	}

}
