package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

	//Initialization
	public Product_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Declaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductButton;
 
	// Getters Method
	public WebElement getCreateProductButton() {
		return createProductButton;
	}
	
	// Business Logic
	public void createProductButtonClick()
	{
		createProductButton.click();
	}
	
	// Declaration
			@FindBy(name="productname")
			private WebElement productName;
			
			@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
			private WebElement saveButton;
			
			@FindBy(xpath="//input[@title='Delete [Alt+D]']")
			private WebElement deleteButton;

			// Getters Method
			public WebElement getProductName() {
				return productName;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}
			
			public WebElement getDeleteButton() {
				return deleteButton;
			}

			// Business Logic
			public void enterProductName(String prodName)
			{
				productName.sendKeys(prodName);
			}
			public void saveButtonClick()
			{
				saveButton.click();
			}
			
			public void deleteButtonClick()
			{
				deleteButton.click();
			}
}

