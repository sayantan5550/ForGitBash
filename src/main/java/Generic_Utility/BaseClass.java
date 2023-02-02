package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Object_Repo.Home_Page;
import Object_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver; 
	@BeforeSuite()
	public void BS()
	{
		System.out.println("Database Connection");
	}
	
	@BeforeTest()
	public void BT()
	{
		System.out.println("Parallel execution");
	}

	@BeforeClass()
	public void BC() throws Throwable
	{
		File_Utility flib = new File_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();
		String browser = flib.getKeyAndValue("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		wlib.maximizeScreen(driver);
		wlib.waitForPageToLoad(driver);
	
		sdriver = driver;
	}

	@BeforeMethod()
	public void BM() throws Throwable
	{
		File_Utility flib = new File_Utility();
		Login_Page login = new Login_Page(driver);
		String URL = flib.getKeyAndValue("url");
		String USERNAME = flib.getKeyAndValue("username");
		String PASSWORD = flib.getKeyAndValue("password");
		
		driver.get(URL);
		
		login.loginToApp(USERNAME, PASSWORD);
	}
	
	@AfterMethod()
	public void AM() throws InterruptedException
	{
		Home_Page hp = new Home_Page(driver);
		Thread.sleep(2500);
		hp.signOutClick(driver);
	}
	
	@AfterClass()
	public void AC()
	{
		driver.quit();
	}
	
	@AfterTest()
	public void AT()
	{
		System.out.println("Execution done");
	}
	@AfterSuite()
	public void AS()
	{
		System.out.println("Database closed");
	}
	
}
