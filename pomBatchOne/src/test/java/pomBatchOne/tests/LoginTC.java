package pomBatchOne.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomBatchOne.demoqa.pages.LoginPage;

public class LoginTC {
	
	
	WebDriver driver;

	LoginPage lgnPg;
	
	@Test
	public void validLogin() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		lgnPg = new LoginPage(driver);
		lgnPg.login("gunjan","password");
	}

}
