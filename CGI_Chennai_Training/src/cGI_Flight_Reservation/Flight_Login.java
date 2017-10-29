package cGI_Flight_Reservation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Flight_Login {
	ChromeDriver driver;
	@Test
	public void Login() throws InterruptedException
	{
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\CGI_Chennai_Training\\chromedriver.exe");
		  // ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//Added New Line for GitHUb
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("findFlights")).click();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("reserveFlights")).click();
		
		//driver.quit();
		//driver.close();
			
	}
	
	  @Before
	  public void LaunchBrowser() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\CGI_Chennai_Training\\chromedriver.exe");
		  driver = new ChromeDriver();
	 }
	  
	  @After
	  public void CloseBrowser() {
		  driver.quit();
	  }
	
}
