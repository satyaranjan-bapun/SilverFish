package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class Taskpage extends BasePage
{
	public WebDriver driver;
	
	@FindBy (xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy (xpath="//div[@class='item createNewCustomer']")
	private WebElement 	newcustomerlink;
	
	@FindBy (xpath="(//div[@class='editButton'])[16]")
	private WebElement editbutton;
	
	@FindBy (xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionbutton;
	
	@FindBy (xpath="(//div[.='Delete'])[2]")
	private WebElement deletebutton;
	
	@FindBy (xpath="//span[.='Delete permanently']")
	private WebElement deletepermanently;
	
	public Taskpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod()
	{
		addnewButton.click();
	}

	public void addnewCustomerMethod() 
	{
		newcustomerlink.click();
	}
	
	public void deletemethod() throws InterruptedException 
	{
		editbutton.click();
		Thread.sleep(5000);
		//actionbutton.click();
		javascriptclick(driver, actionbutton);
	
		
		deletebutton.click();
		Thread.sleep(4000);
		//javascriptclick(driver, deletepermanently);
		deletepermanently.click();
		
	}
	
	
}
