package Product;

import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import Object_Repo.Home_Page;
import Object_Repo.Product_Page;
import Object_Repo.ValidationAndVerificationPage;

public class CreateProductAndDeleteTest extends BaseClass {
	@Test()
	public void prodAndDelete() throws Throwable {
		
		// Generic Utilities Objects
		WebDriver_Utility wlib = new WebDriver_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		
		// POM Pages Objects
		Home_Page hp = new Home_Page(driver);
		Product_Page pp = new Product_Page(driver);

		hp.productButtonClick();
		pp.createProductButtonClick();
		
		//Creating a random number
		int ranNum = jlib.getRandomNum();
		//Getting Product data from excel
		String productName = elib.getExcelData("Product", 0, 0)+ranNum;
		
		pp.enterProductName(productName);
		pp.saveButtonClick();
		
		ValidationAndVerificationPage validate  =new ValidationAndVerificationPage(driver);
		validate.validateProduct(productName);
		
		pp.deleteButtonClick();
		wlib.switchToAlertAndAccept(driver);
		
	}
}
