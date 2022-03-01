package week6.day2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateLead extends BaseClass{
	@Test(retryAnalyzer = RetryListener.class)
	public void createLead() {
		
		String title=driver.getTitle();
		
		//Assert.assertEquals(title, "My Home");		//hard Assertion
		
		SoftAssert sa = new SoftAssert();				//soft Assertion
		sa.assertEquals(title, "My Home"); 				
		
		driver.findElement(By.linkText("Leads1")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rashmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bhatt");
		
		sa.assertAll();	
}
}
