package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{

	int count=1;
	
	//@Override
	public boolean retry(ITestResult result) {
		if(count<2) {
			count++;
			return true;
		}
		return false;
	}

}
