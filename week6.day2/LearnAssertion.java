package week6.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {

	@Test
	public  void main() {
		
		String a = "TestLeaf";
		String b = "Test";
		//Assert.assertEquals(a, b);	//hard Assertion,if condition fails will skip rest of the lines
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b); 			//Soft Assertion, if condition fails still execute rest of the lines, if it fails,still will show pass
		System.out.println("Last line");
		sa.assertAll();				//AssertAll will show fails msg after failure in code
	}

}
