package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Select your favorite language 
		WebElement language = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(language);
		Thread.sleep(3000);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByVisibleText("Selenium");
		List<WebElement> list  = select.getOptions();
		
	/*	WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		country.sendKeys("India"); */
		
	}
	
	
	
	

}
