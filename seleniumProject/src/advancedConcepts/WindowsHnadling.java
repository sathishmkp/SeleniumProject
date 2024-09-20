package advancedConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHnadling {


	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");

		//Click and conform the new window opened
		String oldWindow=  driver.getWindowHandle();
		WebElement clickButton=driver.findElement(By.id("j_idt88:new"));
		clickButton.click();

		Set<String> handles = driver.getWindowHandles();
        for (String newWindow: handles) {
        driver.switchTo().window(newWindow);
	    String newWindowTitle=driver.getPageSource();
	    System.out.println(newWindow.isBlank());
		System.out.println("New window Title:"+newWindowTitle);
		//driver.close();
		driver.switchTo().window(oldWindow);
		
		//No of windows
		WebElement countWindows = driver.findElement(By.id("j_idt88:j_idt91"));
		countWindows.click();
		Set<String> multipleHandles = driver.getWindowHandles();	
		List<String> windowsHandle = new ArrayList<>(multipleHandles);
		String thirdWindow = windowsHandle.get(2);
		driver.switchTo().window(thirdWindow);
	    int count=	driver.getWindowHandles().size();
	    System.out.println("No of windows:"  +count);
	    
		driver.close();
 		 
		


		}



	}




}

