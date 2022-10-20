package test;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils.Task;

import generics.BaseTest;
import pom.HomePage;
import pom.LoginPage;
import pom.NewCustomerPage;
import pom.Taskpage;

public class ActitimeloginLogout extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException 
	{
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
		HomePage home=new HomePage(driver);
		home.taskMethod();
		
		Taskpage task=new Taskpage(driver);
		task.addnewMethod();
		task.addnewCustomerMethod();
		Thread.sleep(3000);
		
		NewCustomerPage customer=new NewCustomerPage(driver);
		customer.entercustomernameMethod();
		customer.entercustomerDescriptionareaMethod();
		customer.createcustomerMethod();
		Thread.sleep(6000);
		task.deletemethod();
		Thread.sleep(6000);
		
		
		home.logoutMethod();
	}
}
