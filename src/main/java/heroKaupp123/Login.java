package heroKaupp123;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends Methods {
	LoginLocaters loc = new LoginLocaters();
	
	@BeforeTest
	public void launchUrl() {
		launchBrowser();
		launchUrl("https://the-internet.herokuapp.com/login");
		
	}
	
	@Test(priority = 1)
	public void login() {
		sendKeys(loc.userName, "tomsmith");
		sendKeys(loc.password, "SuperSecretPassword!");
		click(loc.login);
	}
	
	@Test(priority = 2)
	public void logout() {
		click(loc.logout);
	}
	@Test(priority = 3)
	public void checkLinks() throws InterruptedException {
		navigateTo("https://the-internet.herokuapp.com/");
		checkLinks(loc.links);
		driver.close();
		
		
	}

	
}

	

