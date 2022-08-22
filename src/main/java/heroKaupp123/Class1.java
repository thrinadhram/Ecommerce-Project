package heroKaupp123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	
	@Test
	public void browser() {
		
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
	}
}
		
		
		
		
		
		