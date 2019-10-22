package homework_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
		public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		private static String weburl="https://www.n11.com/";
		
		@FindBy (className="btnSignIn")
		private WebElement btnSıgnIn;
		
		@FindBy (id="loginButton")
		private WebElement loginButton;
		
		public void getLoginPage()
		{
			btnSıgnIn.click();
			wait.until(elementClickableById(loginButton));
		}
		public String getUrl()
		{
			return weburl;
		}
		
	}


