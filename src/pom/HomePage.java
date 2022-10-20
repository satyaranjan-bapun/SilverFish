package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;
import generics.BaseTest;


public class HomePage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settings;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod()
	{
//		logoutLink.click();
		clickwebelement(driver, logoutLink);
		
	}
	public void taskMethod()
	{
		tasksLink.click();
	}
	public void settingsMethod()
	{
		settings.click();
	}
}