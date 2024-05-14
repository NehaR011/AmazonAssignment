package AmazonPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
	

		 WebDriver driverWeb;
			
			public LoginPage(WebDriver driver) {
				this.driverWeb = driver;
				}
			
			public void user(String usn) {
				driverWeb.findElement(By.id("ap_email")).sendKeys(usn);
				
				}
		
			// Password Field
			public void pass(String psn) {
				driverWeb.findElement(By.id("ap_password")).sendKeys(psn); 	
				}
			
			//Continue Button
			public void Cbtn() {
				driverWeb.findElement(By.id("continue")).click(); 	
					}
			
			//Login Button
			public void SignInbtn() {
				driverWeb.findElement(By.id("signInSubmit")).click(); 	
				}
			
			//Capturing Error Message
			public WebElement error_msg() {
						WebElement error = driverWeb.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span"));
						return error;
						}
					
					
					
	}



