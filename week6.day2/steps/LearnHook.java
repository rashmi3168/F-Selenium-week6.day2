package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHook extends BaseClass{
		
		//public static ChromeDriver driver;
		@Before
		public void precondition()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
		}

		@After
		public void postcondition()
		{
			System.out.println("bye bye");
			//driver.close();
		}
}
