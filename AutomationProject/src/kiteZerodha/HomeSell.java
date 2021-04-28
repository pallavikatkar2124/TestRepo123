package kiteZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeSell {
	WebDriver driver;
	
	@FindBy (xpath =" //input[@id='search-input']")
	private WebElement search;

	@FindBy (xpath =" (//span[@class='tradingsymbol'])[1]")
	private WebElement searchitem;
	
	@FindBy(xpath= "//button[text()='S ']")
	private WebElement sell;
	
	@FindBy(xpath= "//label[text()='Intraday ']")
	private WebElement intraday;
	
	@FindBy (xpath ="//label[text()='Market']")
	private WebElement market;

	@FindBy (xpath =" //label[text()='Limit']")
	private WebElement limit;

	@FindBy (xpath ="//label[text()='SL']")
	private WebElement stoploss;

	@FindBy(xpath= "//label[text()='SL-M']")
	private WebElement marketStopLoss;

	@FindBy(xpath= "//button[@type='submit']")
	private WebElement SubmitSell;
	
	@FindBy (xpath ="(//button[@type='button'])[3]")
	private WebElement cancle;
	
	public HomeSell(WebDriver driver)
	{ 
	      this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void Search() {
		
		search.click();
		search.sendKeys("Dabur");
	}
     
     public void SearchItem() {
		
		searchitem.click();
	}
    public void sell() {
	  
    	sell.click();
	
	System.out.println("sell");
    }
    
	public void  Intraday() {
		
		intraday.click();
		System.out.println("intraday");
    }
	
    public void  Market() {
		
		market.click();
		System.out.println("market");
    }
    
   public void Limit() {
		
		limit.click();
		System.out.println("limit");
    }
   
    public void LimitStop() {
	
	stoploss.click();
	System.out.println("limitstop");
    }
    
    public void MarketStop() {
    	
    	marketStopLoss.click();
    	
    	System.out.println("marketstop");
    }
    
    public void SubmitSell() {
    	
	 SubmitSell.click();
	 	
    	System.out.println("submit");
    }

    	public void Cancle() {
        	
    		 cancle.click();
    		 	
    	    	System.out.println("cancle");
}


}