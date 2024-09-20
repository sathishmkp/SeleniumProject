package advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Maplogik {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://maplogik.com/");
	
			driver.findElement(By.id("map_email")).sendKeys("chandramohansekarv@gmail.com");
			driver.findElement(By.id("map_pass")).sendKeys("567705890");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(3000);
			//WebElement dashboard =driver.findElement(By.xpath("//div[@class='app-sidebar menu-fixed expanded']" )); 
			  Actions actions=new Actions(driver);
			// actions.moveToElement(dashboard).build().perform(); 
			 Thread.sleep(3000);
			 WebElement internship = driver.findElement(By.xpath("//span[normalize-space()='Internship']"));
			  actions .moveToElement(internship).click().build().perform();
			 
		

}
}