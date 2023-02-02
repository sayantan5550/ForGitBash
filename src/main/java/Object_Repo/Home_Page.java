package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.WebDriver_Utility;

public class Home_Page {
	
	//Initialization
	public Home_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organizationButton;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productButton;
	
	@FindBy(linkText="More")
	private WebElement moreDd;
	
	@FindBy(name="Campaigns")
	private WebElement campaignsButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorSignOut;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	

// Getters Methods
	
	public WebElement getOrganizationButton() {
		return organizationButton;
	}

	public WebElement getProductButton() {
		return productButton;
	}

	public WebElement getMoreDd() {
		return moreDd;
	}

	public WebElement getCampaignsButton() {
		return campaignsButton;
	}
	
	public WebElement getAdministratorSignOut() {
		return administratorSignOut;
	}
	
	public WebElement getSignOut() {
		return signOut;
	}
	

// Business Logic
	

	public void organizationButtonClick() {
		organizationButton.click();
	}

	public void productButtonClick() {
		productButton.click();;
	}

	public void moreDdAction(WebDriver driver) {
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.mouseOverOnElenemt(driver, moreDd);
	}

	public void campaignsButtonClick() {
		campaignsButton.click();
	}
	
	public void signOutClick(WebDriver driver)
	{
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.mouseOverOnElenemt(driver, administratorSignOut);
		signOut.click();
	}
	
	
}
