package kiteZerodha;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin {
	
        WebDriver driver;
        
	@FindBy (xpath =" //input[@id='userid']")
	private WebElement userid;

	@FindBy (xpath =" //input[@id='password']")
	private WebElement password;

	@FindBy (xpath ="//button[@type='submit']")
	private WebElement login;

	@FindBy(xpath= " //input[@id='pin']")
	private WebElement Pin;
	
	@FindBy (xpath ="//button[text()='Continue ']")
	private WebElement Continue;

	public KiteLogin(WebDriver driver)
	{ 
	     this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void UserName() {
		
		userid.sendKeys("DV1510");
	}
		public void Password() {
			password.sendKeys("Vijay@123");
		    
		}	
		public void LoginButton() {
		login.click();
	
		}
		
		public void Pin() 
		{ 
			
			Pin.sendKeys("959594");
		}
		public void ClickonContinueTab()
		{
		Continue.click();
		
		}
		public void gettextOfLoginButton() {
			System.out.println(login.getText());
			}

}

