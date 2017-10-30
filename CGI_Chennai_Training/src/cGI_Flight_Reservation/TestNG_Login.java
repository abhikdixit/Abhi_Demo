package cGI_Flight_Reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Login {
	WebDriver driver;
  @Test
  @Parameters({"uname","upass"})
  public void Login(String uname,String upass) {
	  
		//WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(upass);
		driver.findElement(By.name("login")).click();
		driver.quit();
  }
  
  @BeforeTest
  public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\CGI_Training\\chromedriver.exe");
      driver = new ChromeDriver();
 }
  
  @AfterTest
  public void CloseBrowser() {
	  driver.quit();
  }
}
