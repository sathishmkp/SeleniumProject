package advancedConcepts;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		//Frame1 text
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String text1=button1.getText();
		System.out.println(text1);
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       
         wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().defaultContent();
	     
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		String text2=button2.getText();
		System.out.println(text2);

		driver.switchTo().defaultContent();
		
		

		//Frame3-No of Frames 

		List<WebElement> noOfFrames =driver.findElements(By.tagName("iframe"));
		int framesCount=noOfFrames.size();
		System.out.println(framesCount);
		
		





	}

}
