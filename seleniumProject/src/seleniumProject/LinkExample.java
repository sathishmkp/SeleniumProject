package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
	
	public static void main (String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.leafground.com/link.xhtml");
	
	WebElement dashBoard = driver.findElement(By.linkText("Go to Dashboard"));
	dashBoard.click();
	
	driver.navigate().back();
	
	WebElement getUrl = driver.findElement(By.xpath("//*[@id='j_idt87']/div/div[1]/div[2]/div/div/a"));
	
	
	String linkUrl = getUrl.getAttribute("href");
	
	System.out.println("Link URL: " + linkUrl);
	
	WebElement link=driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[2]/div[2]/div/div/a"));
	link.click();
	 
	List<WebElement> linkCount=driver.findElements(By.tagName("a"));
	int count = linkCount.size();
	 
	System.out.println("Count of links in this page:" +count);
	
	
	
	
	}
	

}
