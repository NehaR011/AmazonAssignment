package AmazonTestCasePackage;

import AmazonPackage.HomePage;
import AmazonPackage.LoginPage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;



public class BaseTestClass {
	  
		public WebDriver driver;
		public HomePage hp; 
		public LoginPage lp;

		@BeforeTest
		  public void beforeTest() {
			  	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.amazon.in/");
				hp = new HomePage(driver);	
				lp = new LoginPage(driver);
				System.out.println("\t******!!!Before Testing!!!******");
			 }
		
		@BeforeClass
		public void pageSetup() {
			hp.signIn_test();
		}

		 @AfterTest
		  public void afterTest() {
			 System.out.println("\n\t******!!!After Testing!!!******");
		  	  driver.close();
			 
		  }
	 
}
