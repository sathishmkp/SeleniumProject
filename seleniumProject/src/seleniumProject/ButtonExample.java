package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonExample {

	public  static void   main(String[] args) {


		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node06p3unemeeces1pczuofz8b36z667062.node0");



		//Click and conform the title 
		WebElement ClickButton=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']/span"));
		ClickButton.click();
		driver.navigate().back();

		//if the button is disabled 
        WebElement DisableButton=driver.findElement(By.id("j_idt88:j_idt92"));
        boolean Disable =	DisableButton.isEnabled();
		System.out.println(Disable);
		
		// Find the color of the button
		WebElement ColoroftheButton =driver.findElement(By.id("j_idt88:j_idt96"));
		String color=ColoroftheButton.getCssValue("background-color");
		System.out.println(color);
		
		//Move the mouse over to the button and check color was changed or not
		WebElement colorChange=driver.findElement(By.id("j_idt88:j_idt100"));
	    String color1 =	colorChange.getCssValue("background-color");
	    System.out.println("Before Move:"+color1);
	
		Actions actions=new Actions(driver);
		actions.moveToElement(colorChange).perform();
		String color2=colorChange.getCssValue("background-color");
		System.out.println("After Move:"+color2);
		
		//Click on any hidden Button
		/*
		 * WebElement ImageButton =
		 * driver.findElement(By.id("j_idt88:j_idt102:imageBtn")); ImageButton.click();
		 * JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 * jsExecutor.executeScript("arguments[0].click();", ImageButton);
		 */
	   
		
		
		
		
		
		
		
		






	}
}
