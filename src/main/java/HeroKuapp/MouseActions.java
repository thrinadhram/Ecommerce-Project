package HeroKuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.navigate().to("http://the-internet.herokuapp.com/context_menu");

		Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.id("hot-spot"))).contextClick().perform();

		Alert alerts = driver.switchTo().alert();

		System.out.println(alerts.getText());

		alerts.accept();
		driver.close();

		
	}

}
