package pomBatchOne.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	
	@FindBy(id="userName")
	private WebElement uName;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	
	@FindBy(id="login")
	private WebElement sbmtBtn;

	public LoginPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);


	}
	
	public void login(String user, String pass) {
		uName.sendKeys(user);
		pwd.sendKeys(pass);
		sbmtBtn.click();
	}
	
}
