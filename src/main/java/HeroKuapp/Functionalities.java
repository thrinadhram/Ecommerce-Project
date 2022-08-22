package HeroKuapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functionalities {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.navigate().to("http://the-internet.herokuapp.com/");

		//Basic Auth//

			driver.findElement(By.xpath("//a[@href ='/basic_auth']")).click();
			
			
			Thread.sleep(3000);
		
		
			driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			
			



		//checkboxes
			
			driver.navigate().to("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();

  	WebElement check1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));

		check1.click();                  //check//

		Thread.sleep(3000);

		if(check1.isSelected())
		
			check1.click();            //Uncheck//
		
		System.out.println("Checkbox-1 is CHECKED and UNCHECKED ");
		
		Thread.sleep(2000);

		WebElement check2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]"));

		Thread.sleep(2000);

		if(check2.isSelected())

			check2.click();
		
		System.out.println("Check box-2 is UNCHECKED");
		
		
		//DropDown
		
		driver.navigate().to("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select option1 = new Select(dropdown);
		
		option1.selectByValue("1");
			
			System.out.println("Option-1 is selected");
		
		Thread.sleep(3000);
		
		Select option2 = new Select(dropdown);
		
		option2.selectByValue("2");
		
		System.out.println("Option-2 is selected");
		
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@href='/disappearing_elements']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
             Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Portfolio')]")).click();
		
		 Thread.sleep(3000);
			
			driver.navigate().back();
			
			driver.navigate().to("http://the-internet.herokuapp.com/");
			
			driver.findElement(By.xpath("//a[@href='/dynamic_content']")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'click here')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'click here')]")).click();
			Thread.sleep(3000);
			
			
			driver.navigate().to("http://the-internet.herokuapp.com/");
			
			
			
		
		
		
		
		
		
		

		
		 

		
		
		
	
	     
	     
		
	




	}

}
