package kiteZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaLogout {
WebDriver driver;

    @FindBy (xpath ="//span[@class='user-id']")
    private WebElement DV1510;

	@FindBy (xpath ="//a[@target='_self']")
	private WebElement logout;

	@FindBy (xpath ="//a[@class='remove text-xxsmall']")
	private WebElement changeuser;

	public zerodhaLogout (WebDriver driver)
	{ 
	      this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	public void DV1510() {
		
		DV1510.click();
}
	public void logOut() {
		
		logout.click();
}

	public void changeUser() {
		changeuser.click();
	    
	}	
	
}