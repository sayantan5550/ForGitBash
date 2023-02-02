package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
/*	@Test
	public void createContact()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		
		//Hard Assert 
		Assert.assertEquals(false, true);  //(Actual, expected)
		
		System.out.println("Step3");
		System.out.println("Step4");
	}
	@Test
	public void modifyContact()
	{
		System.out.println("Step5");
		System.out.println("Step6");
		
		//Hard Assert 
		Assert.assertEquals(true, true);  //(Actual, expected)
		
		System.out.println("Step7");
		System.out.println("Step8");
	}
*/
	
	@Test
	public void create()
	{
		String exptName = "Sayantan";
		String actName = "SayantanChatterjee";
		Assert.assertEquals(actName, exptName);
	}
		
	
}
