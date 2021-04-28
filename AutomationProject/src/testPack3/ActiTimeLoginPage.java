package testPack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
	
	
	@FindBy (xpath =" //input[@name='username']")
	private WebElement username;

	@FindBy (xpath =" //input[@name='pwd']")
	private WebElement pwd;

	@FindBy (xpath ="//a[@id='loginButton']")
	private WebElement login;
	
    public	ActiTimeLoginPage(WebDriver driver)
	{ 
	  
        PageFactory.initElements(driver, this);
	}
	
	   public void sendUserName() {
		username.sendKeys("admin");
	}
		public void sendPassword() {
		pwd.sendKeys("manager");
		}	
		public void clickOnLoginButton() {
		login.click();
	
		}
		public void gettextOfLoginButton() {
			System.out.println(login.getText());
			}
	}

