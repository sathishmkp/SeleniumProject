package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Trichy"+Keys.ENTER);

	}
    @Test
	public void openGmail() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Learnings\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");
		}

	}
