package AmazonPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	 WebDriver driverWeb;
	
	public HomePage(WebDriver driver) {
		this.driverWeb = driver;
		}
	
	public void MobileSearch() {
		driverWeb.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='Mobiles']")).click(); 	
		}
	
	public String signIn_test() {
		driverWeb.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click(); 
		return driverWeb.getTitle();
		}
	
	public String log_url() {
		String logUrl = driverWeb.getCurrentUrl();
		return logUrl;
		}
	
	public String get_title() {
		String title = driverWeb.getTitle();
		return title;
		}
	

	//https://amazon.in/
	
}
