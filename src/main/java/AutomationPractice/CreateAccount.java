package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
	public static void main(String[] args)throws Exception {
	
		
		//Navigation to AutomationPractice//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
       
       driver.get("http://automationpractice.com/index.php");
       
       Thread.sleep(2000);

	
       driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	    driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	    
	    
			
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("foreverkingsb@yahoo.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		//Registration Input//
		
		driver.findElement(By.xpath("//div[@class='radio-inline']")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Sai Sharma");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Vakkalanka");
		
		driver.findElement(By.id("passwd")).sendKeys("TestPwd!!");
		
		WebElement dob = driver.findElement(By.id("days"));
		
		Select daysdropdown = new Select(dob);
		
		daysdropdown.selectByValue("11");
		
		WebElement months = driver.findElement(By.id("months"));
		
		Select monthdropdown = new Select(months);
		
		monthdropdown.selectByValue("8");
		
		WebElement years = driver.findElement(By.id("years"));
		
		Select ydropdown = new Select(years);
		
       ydropdown.selectByValue("1996");
		
	
		driver.findElement(By.id("firstname")).sendKeys("Sai Sharma");
		driver.findElement(By.id("lastname")).sendKeys("Vakkalanka");
		driver.findElement(By.id("address1")).sendKeys("BapuNagar,SR Nagar");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		
		WebElement state = driver.findElement(By.id("id_state"));
		
		Select statesdropdown = new Select(state);
		
		statesdropdown.selectByValue("2");
		
		
		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.findElement(By.id("phone_mobile")).sendKeys("+919949539889");
		
		
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("alias")).sendKeys("SR nagar");
		
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	}

}

