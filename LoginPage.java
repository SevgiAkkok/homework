package homework_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (id="email")
	private WebElement email;
	
	@FindBy (id="password")
	private WebElement password;

	@FindBy (id="loginButton")
	private WebElement loginButton;
	
	@FindBy (className="user")
	private WebElement userName;
	
	public void enterLoginForm(String email,String password)
	{
		this.email.clear();
		this.email.sendKeys(email);
		
		this.password.clear();
		this.password.sendKeys(password);
	}
	public void submit()
	{
		loginButton.click();
	}
	public String getUserName()
	{
		return userName.getText();
	}
	

}
