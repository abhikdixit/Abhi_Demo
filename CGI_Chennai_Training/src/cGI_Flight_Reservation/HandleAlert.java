package cGI_Flight_Reservation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	private	ChromeDriver driver;	
	@Test
	public void Login() throws Exception
	{
		
 		driver.navigate().to("http://demo.guru99.com/v4/");
		//driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr53532");
		driver.findElement(By.name("password")).sendKeys("nytuzEg");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Log out")).click();
		String ExpTest = driver.switchTo().alert().getText();
		System.out.println(ExpTest);
		driver.switchTo().alert().accept();
		
	}

@Before
public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\Demo_CG\\chromedriver.exe");
	 driver = new ChromeDriver();
}

@After
public void CloseBrowser() {
	  driver.quit();
}
}
