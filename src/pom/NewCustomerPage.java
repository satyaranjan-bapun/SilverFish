package pom;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class NewCustomerPage implements AutoConstant 
{
	public WebDriver driver;
	
	@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerDescriptionarea;
	
	@FindBy (xpath="//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy (xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public NewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entercustomernameMethod()
	{
		entercustomernameTextfield.sendKeys("satya");
	}
	public void  entercustomerDescriptionareaMethod()
	{
		 entercustomerDescriptionarea.sendKeys("i am an Senior Test Engineer");
	}
	public void createcustomerMethod()
	{
		createcustomerButton.click();
	}
	public void cancelMethod()
	{
		cancelButton.click();
	}
	public void acceptMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void dismissMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void createcustomerMethod1() throws IOException 
	{
		entercustomernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name1, 1, 0));
		entercustomerDescriptionarea.sendKeys(ExcelLibrary.getcellvalue(sheet_name1, 1, 1));
		createcustomerButton.click();

	}
	
}
