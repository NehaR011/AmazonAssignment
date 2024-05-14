package AmazonTestCasePackage;

import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseTestClass{

  
	  @Test
		public void logintest() throws InterruptedException {
		  
		  
		  Thread.sleep(3000);
			lp.user("9000000000");
			Thread.sleep(3000);
			lp.Cbtn();
			Thread.sleep(3000);
			lp.pass("Password112233");
			Thread.sleep(3000);
			lp.SignInbtn();
			
			Thread.sleep(3000);
			System.out.println("\n Error shown for wrong password:" +  lp.error_msg().getText());
		}

		

	//Verifying the successful login case



	}

