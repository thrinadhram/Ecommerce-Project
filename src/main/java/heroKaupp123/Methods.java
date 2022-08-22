package heroKaupp123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void launchUrl(String url) {
		try {
		driver.get(url);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void navigateTo(String url) {
		try {
		driver.navigate().to(url);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void sendKeys(By loc,String value) {
		
		try {
			driver.findElement(loc).sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
    public void click(By loc) {
		
		try {
			driver.findElement(loc).click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

    public void checkLinks(By loc) throws InterruptedException {
    	List<WebElement> l = driver.findElements(loc);
    	for(int i=0;i<l.size();i++) {
    		l.get(i).click();
    		Thread.sleep(2000);
    		System.out.println(driver.getTitle());
    		Thread.sleep(1000);
    		driver.navigate().back();
    		Thread.sleep(3000);
}
    }
}
