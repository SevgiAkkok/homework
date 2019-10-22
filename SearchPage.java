package homework_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	
	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (id="searchData")
	private WebElement searchData;
	
	@FindBy (className="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(xpath="((*[@class='resultText ']/strong")
	private WebElement countResult;
	
	@FindBy(xpath="((*[@class='pagination']/a[2]")
	private WebElement secondButton;
	
	public void enterDataForSearch(String data)
	{
		this.searchData.clear();
		this.searchData.sendKeys(data);
	}
	public void submitForSearch()
	{
		searchBtn.click();
	}
	public String getCountResult()
	{
		return countResult.getText();
	}
	public void clickSecondButton()
	{
		secondButton.click();
	}
	
	
	
	

}
