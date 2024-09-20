package seleniumProject;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        
		driver.get("https://www.leafground.com/alert.xhtml");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\ADM Videos");
		FileUtils.copyFile(srcFile, file);
		
		
		
		//Conform Alert
		WebElement ConformAlert=driver.findElement(By.id("j_idt88:j_idt91"));
		ConformAlert.click();
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.alertIsPresent());
		
		Alert Conform =driver.switchTo().alert();
		Conform.accept();
	   // Robot robot = new Robot();
	    
	//  Dimension scrnSize=    Toolkit.getDefaultToolkit().getScreenSize();
	 // Rectangle
	
	Thread.sleep(3000);
		
		//Dialog Alert
		WebElement DialogAlert = driver.findElement(By.id("j_idt88:j_idt93"));
		DialogAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert Dialog = driver.switchTo().alert();
		Thread.sleep(3000);
		Dialog.dismiss();
		
		//Sweet Alert
		WebElement SweetAlert =driver.findElement(By.id("j_idt88:j_idt95"));
		Thread.sleep(3000);
		SweetAlert.click();
		//wait.until(ExpectedConditions.alertIsPresent());
		//Alert Sweet = driver.switchTo().alert();
		//wait.until(ExpectedConditions.alertIsPresent());
		//Sweet.dismiss();
		WebElement Sweet1 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']"));
		Thread.sleep(3000);
		Sweet1.click();
		
		WebElement SweetDialog =driver.findElement(By.id("j_idt88:j_idt100"));
		Thread.sleep(3000);
		SweetDialog.click();
		
		WebElement close = driver.findElement(By.id("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span"));
		Thread.sleep(3000);
		close.click();
		
		
		
	
		
		
		
	
;
		
		

	}

}
