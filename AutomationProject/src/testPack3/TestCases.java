package testPack3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	
	  WebDriver driver;
	  
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Browser launch and open application");
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver88\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://desktop-290heu1/login.do");
	
}

	@BeforeMethod
	public void beforeMethod()  {
		
		System.out.println("login on");
		ActiTimeLoginPage a = new ActiTimeLoginPage(driver);
		
		a.sendUserName();
		a.sendPassword();
		a.clickOnLoginButton();
		
	}
	
	@Test
	public void test1() 
	{
		
		ActiTimeHomePage b = new ActiTimeHomePage(driver);
		
		b.ClickonUserTab();
		System.out.println("verify user button");
	}
	
	@Test
	public void test2()
	{
		ActiTimeHomePage b = new ActiTimeHomePage(driver);
		
	    b.ClickonReportTab();
		System.out.println("verify report button");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		ActiTimeLogout c = new ActiTimeLogout(driver);
		c.Logout();
		System.out.println("logout");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("close the browser");
	}
	
	
	
}