package AmazonTestCasePackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.Assert;

public class HomePageTestCase extends BaseTestClass{
  
		
		
		@Test(priority=1)
	  public void validate_AmazonHomePage() throws InterruptedException {
			
			String actUrl = hp.log_url();
			Assert.assertTrue(actUrl.contains("amazon"),"Test Failed: Home Page URL not Matched!!");
			System.out.println("Test Passed: Home Page URL Matched that is: " + hp.log_url()+ "\n");
			Thread.sleep(3000);
			
			
			String actTitle = hp.get_title();
			Assert.assertTrue(actTitle.contains("India"),"Test Failed: Home Page Title does not Matched!!");
			System.out.println("Test Passed: Home Page Title Matched which is: " + hp.get_title()+ "\n");
			
			
	  }
		
		
		@Test (priority=2)
		  public void validate_TodaydealPage() throws InterruptedException {
			
			Thread.sleep(6000);
			hp.MobileSearch();
			
			String actUrl = hp.log_url();
			Assert.assertTrue(actUrl.contains("deals"),"Test Failed: Home Page URL not Matched!!");
			System.out.println("Test Passed: Todays Deal URL Matched that is: " + hp.log_url()+ "\n");
			
			Thread.sleep(3000);
			
			String actTitle = hp.get_title();
			Assert.assertTrue(actTitle.contains("eal"),"Test Failed: Home Page Title does not Matched!!");
			System.out.println("Test Passed: Todays Deal Title Matched which is: " + hp.get_title()+ "\n");
			
		  }
		
		  
		@Test (priority=3)
		  public void validate_signIn() throws InterruptedException {
			
			Thread.sleep(5000);
			
			String actTitle = hp.signIn_test();
			Assert.assertTrue(actTitle.contains("Sign In"),"Test Failed: User not navigaed to SignIn page!!");
			System.out.println("Test Passed: User navigaed to SignIn page! " + hp.get_title()+ "\n");
			
		  }

	 

	}

	
	
	
	
	

