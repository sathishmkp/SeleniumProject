package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", 
				"C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//Select the favorite browser
		WebElement Select=driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[3]/div/div[2]"));
		Select.click();
		
		
	}
}
