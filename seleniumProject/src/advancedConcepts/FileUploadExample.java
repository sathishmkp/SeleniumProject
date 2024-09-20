package advancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']/span[1]")).click();
		
		Thread.sleep(3000);
		
		String file = "C:\\Users\\sathi\\OneDrive\\Desktop\\My Files\\Sathish SQE.pdf";
		
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
