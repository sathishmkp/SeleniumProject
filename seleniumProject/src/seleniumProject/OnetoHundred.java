package seleniumProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnetoHundred {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.get("https://www.amazon.in/");
		WebElement mobiles = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		mobiles.click();
		
		
		//WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(mobiles));
		
	    WebElement chechk1 =	driver.findElement(By.xpath("//*[@id='apb-browse-refinements-checkbox_0']//following::i[1]"));
	    chechk1.click();
	    
	    
	    
	    
		}
       
	}


