package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteExamples {
	WebDriver driver;
	long startTime;
	long endTime;
	
	
	@BeforeSuite
	public void openChrome() {
		 startTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	

	@Test  
	    public void openGoogle(){
		driver.get("https://www.google.com/");
	}
	@Test
	    public void openGmail() {
		driver.get("https://www.gmail.com/");	
	}
	@Test
	    public void openBing() {
		driver.get("https://www.bing.com/");
	}		
	
	@AfterSuite
	public void closeBrowser(){
	endTime=System.currentTimeMillis();
	long totalTime=endTime-startTime;
	System.out.println("Total time Taken:"+  totalTime );
	driver.close();
	
	
	
	
	
		
		
		
		


}
}
