package seleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException, IOException {

		FileInputStream inputStream =new FileInputStream("cconfig.properties");
		Properties prop= new Properties();
		prop.load(inputStream);
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("location"));
        WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));

		Thread.sleep(2000);
		driver.quit();




	}

}
