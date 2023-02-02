package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	
	@Test
	public void createContact()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(false, true);  //(Actual, expected)
		
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
	}
	@Test
	public void modifyContact()
	{
		System.out.println("Step1");
		System.out.println("Step2");
	}
}
