package Generic_Utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	
	public void maximizeScreen(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * wait for page to load before identifying any synchronization element in DOM
	 * @author 91910
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	/**
	 * After every second it will wait for next action to perform
	 * @author 91910
	 */
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
	/**
	 * used to wait for element to be clickable in GUI and check for specific element in every 500 millisecond
	 * @author 91910
	 */
	
	public void waitForElementWithCustomTimeout(WebDriver driver, WebElement element, int pollingTime)
	{
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(pollingTime));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * used to switch to any Window based on window title
	 * @param driver
	 * @param PartialWindowTitle
	 * @author 91910
	 */
	public void switchToWindow(WebDriver driver, String PartialWindowTitle) 
	{
		Set<String> allId = driver.getWindowHandles();
		Iterator<String> it = allId.iterator();
		while(it.hasNext())
		{
			String wid = it.next();
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			if(title.contains(PartialWindowTitle))
			{
				break;
			}
		}
	}
	/**
	 * used to switch to Alert Window and Accept (click on ok Button)
	 * @param driver
	 * @author 91910
	 */
	public void switchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * 
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) 
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * 
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * 
	 */
	public void switchToFrame(WebDriver driver, String id_name_Attribute)
	{
		driver.switchTo().frame(id_name_Attribute);
	}
	/**
	 * 
	 */
	public void select (WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * 
	 */
	public void select (WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}	
	/**
	 * 
	 */
	public void mouseOverOnElenemt(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClickOnElement(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
}
