package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {
	WebDriver driver;

	Actions action;

	@BeforeClass
	public void setUp() throws Exception {

 

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority =1)
	public void logintest() throws Exception {

		driver.findElement(By.id("email")).sendKeys("foreverkingsb@yahoo.com");

		driver.findElement(By.id("passwd")).sendKeys("TestPwd!!");

		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

	}

	@Test(priority = 2)
	public void shopping() throws Exception {

		driver.findElement(By.id("search_query_top")).sendKeys("t-shirts");

		driver.findElement(By.name("submit_search")).click();

		Thread.sleep(3000);



	}

	@Test(priority = 3)
	public void addtocart() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollTo(0,500)", "");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"))).perform();

		Thread.sleep(3000);

		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"))).click().perform();



		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@title='Continue shopping']//span[1]")).click();

		driver.findElement(By.cssSelector("li:nth-child(3) a:nth-child(1) img:nth-child(1)")).click();

		Thread.sleep(3000);
	}

	@Test(priority =4)
	public void addtocart2() {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)", "");

		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();


	}

	@Test(priority = 5)
	public void checkout() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000)", "");

		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,1000)", "");

		driver.findElement(By.name("message")).sendKeys("Please ring the bell at the time of delivery");

		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]/i[1]"))
		.click();

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,500)", "");

		WebElement check = driver.findElement(By.xpath("//input[@id='cgv']"));

		check.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"))
		.click();

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,1000)", "");

		driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]"))
		.click();

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,500)", "");

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"))
		.click();

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,500)", "");

		Thread.sleep(3000);

		driver.close();

	}
}

