package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", 
				"C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01u7o8oo7wij4j77w8mwo2r5bd675269.node0");
       
		// Type your Name in that Box
		
		WebElement NameBox=driver.findElement(By.id("j_idt88:name"));
		NameBox.sendKeys("Sathish Kumar A");

		// Append the country Name in that box2
		
		WebElement AppendCountry=driver.findElement(By.id("j_idt88:j_idt91"));
		AppendCountry.sendKeys(" -India");
		
		//Is the Box disabled or not

		WebElement DisabledBox=driver.findElement(By.id("j_idt88:j_idt93"));
        boolean Disable=  DisabledBox.isEnabled();
        System.out.println(Disable);
         
        //Clear the text on that box
        
		WebElement ClearBox=driver.findElement(By.id("j_idt88:j_idt95"));
		ClearBox.clear();
		
		//Retrieve the text from that box

		WebElement RetrieveBox=driver.findElement(By.id("j_idt88:j_idt97"));
        String Value=RetrieveBox.getAttribute("value");
		System.out.println(Value);
		
		




	}

}
