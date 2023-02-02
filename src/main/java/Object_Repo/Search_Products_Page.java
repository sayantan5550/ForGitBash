package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Products_Page {

	//Initialization
	public Search_Products_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// Declaration 
	@FindBy(name="search_text")
	private WebElement searchTextField;
	
	@FindBy(name="search")
	private WebElement searchButton;


	// Getters Methods
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	// Business Logic
	/** 
	 * This method is used to search the product name
	 * @param prodName
	 */
	public void searchText(String prodName) {
		searchTextField.sendKeys(prodName);
	}
	/**
	 * This method is used to click on the search button
	 */
	public void searchButtonClick()
	{
		searchButton.click();
	}
	/**
	 * this method is used to click on the product selected 
	 * @param driver
	 * @param productName
	 */
	public void productSelectedClick(WebDriver driver ,String productName)
	{
		String productSelectedXpath = "//a[text()='"+productName+"']";
		driver.findElement(By.xpath(productSelectedXpath)).click();
	}
}
