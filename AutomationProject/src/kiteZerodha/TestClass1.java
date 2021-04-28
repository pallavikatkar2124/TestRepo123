package kiteZerodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestClass1 
{
	
       WebDriver driver;
	  
		@BeforeClass
		  public void beforeClass()
		{
			System.out.println("Browser launch and open application");
			System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver88\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com");
			
			
		}
		 @BeforeMethod
		   public void beforeMethod() 
		{
			
			System.out.println("login on");	

			KiteLogin a = new KiteLogin(driver);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			a.UserName();
			a.Password();
			
			a.LoginButton();
			a.Pin();
			a.ClickonContinueTab();
               a.gettextOfLoginButton();
		}
		
			
		
		
		@Test(priority=1)
		    public void SearchPage() {
			SearchPage b= new SearchPage(driver);
			b.Search();
			
			b.SearchItem();
			b.Buy();
			b.Intraday();
			b.Market();
			b.Limit();
			b.LimitStop();
			b.MarketStop();
			b.SubmitBuy();
	   
	        b.Cancle();
         }

		@Test(priority=2)
		    public void  HomeSell() {
			 HomeSell c = new  HomeSell(driver);
			 c.Search();
			 c.SearchItem();
			 c.sell();
			 c.Intraday();
			 c.Market();
			 c.Limit();
			 c.LimitStop();
			 c.MarketStop();
			 c.SubmitSell();
			 c.Cancle();
		}
		
		@Test(priority=3)
	    public void  HomePage() {
		 HomePage e = new  HomePage(driver);
		 e.dashBoard();
		 e.orders();
		 e.orders1();
		 e.gIT();
		 e.basKets();
		 e.sIP();
		 e.holDings();
		 e.holDings1();
		 e.stocks();
		 e.position();
		 e.funds();
		 e.addFunds();
		 e.withDraw();
		 e.apps();
		 e.marketDepth();
		 e.chart();
		 e.delete();
		 e.more();
		 
		}
     	@AfterMethod
		public void afterMethod()
		{
     		zerodhaLogout d = new zerodhaLogout(driver);
     		d.DV1510();
     		d.logOut();
			
			d.changeUser();
			System.out.println("logout");
	    }
     	
		@AfterClass
		public void afterClass()
		{
			System.out.println("close the browser");
		
		}
		
}