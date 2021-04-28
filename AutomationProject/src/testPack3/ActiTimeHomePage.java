package testPack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeHomePage {
	WebDriver driver;

	@FindBy(xpath= " //table[@id='topnav']//td[9]//a")
	private WebElement UserTab;
	@FindBy (xpath ="(//img[@width=\"84\"])[3]")
	private WebElement ReportTab;
//	@FindBy (xpath =" //table[@id='topnav']//td[7]//a")
//	private WebElement ReportTab;

public	ActiTimeHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}	
		
	public void ClickonUserTab() 
	{ 
		
		UserTab.click();
	}
		
	public void ClickonReportTab()
		{
			ReportTab.click();
		
		}
	
}
	
	
//(//img[@width="84"])[3]
	
	
//	
//		public void selectUserfromDropdown() {
//			Select s = new Select( selectUser);
//			s.selectByIndex(1);
//		
	

   