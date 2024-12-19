package advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		driver.manage().deleteAllCookies();
		
		WebElement From = driver.findElement(By.id("form:drag"));
		WebElement To = driver.findElement(By.id("form:drop_content"));
		Actions action = new Actions(driver);
		
		action.dragAndDrop(From, To).perform();
		
		WebElement From1 = driver.findElement(By.id("form:conpnl_header"));
		WebElement To1 = driver.findElement(By.id("form:restrictPanel"));
		Actions action1 = new Actions(driver);
		
		action1.dragAndDrop(From1, To1).perform();
		

}

	
	
	
}