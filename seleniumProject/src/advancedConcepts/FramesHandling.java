package advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		String text1=button1.getText();
		System.out.println(text1);

		driver.switchTo().defaultContent();

		// Frame2 Text
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
