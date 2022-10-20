package generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
//SELECT CLASS- HANDLING DROPDOWNLIST
	
	public void selectbtvisibletext(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public void selectbyvalue(WebElement ele , String arg)
	{
		Select sel=new Select(ele);
		sel.selectByValue(arg);
	}
	public void selectbyindex(WebElement ele , int arg) 
	{
		Select sel=new Select(ele);
		sel.selectByIndex(arg);
	}
	public void deselectbyvisibletext(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.deselectByVisibleText(text);
	}
	public void deselectbyvalue(WebElement ele , String arg)
	{
		Select sel=new Select(ele);
		sel.deselectByValue(arg);
	}
	public void deselectbyindex(WebElement ele , int arg)
	{
		Select sel=new Select(ele);
		sel.deselectByIndex(arg);
	}
	public void deselectall(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.deselectAll();
	}
	public void ismultiple(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.isMultiple();
	}
	public void getoptions(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.getOptions();
	}
	public void getallselectedoptions(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.getAllSelectedOptions();
	}
	public void getfirstselectedoption(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.getFirstSelectedOption();
	}
//ACTIONS CLASS- MOUSE OPERATIONS
	
	public void movetoelement(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void clickwebelement(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.click(ele).perform();
	
	}
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions (driver);
		act.doubleClick();
	}
	public void contextclick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick();
	}
	public void draganddrop(WebDriver driver,WebElement ele) 
	{
		Actions act=new Actions (driver);
		act.dragAndDrop(ele, ele);
	}
	public void clickandhold(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.clickAndHold();
	}
	public void release(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.release();
	}
//JAVASCRIPT EXECUTOR- WHWNEVER SELENIUM CONVENTIONAL METHODS FAILS TO EXECUTE WE USE J.S EXECUTOR
	//scrolling and scroll to particular element
	public void javascriptclick(WebDriver driver , WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	
//ROBOT CLASS- KEYBOARD OPERATIONS [enter & tab]
	
	public void robenter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
//ALERT CLASS
	
	public void alertaccept(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void alertdismiss(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	

}
