package kiteZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
           WebDriver driver;
	
	@FindBy (xpath =" //input[@id='search-input']")
	private WebElement search;

	@FindBy (xpath =" (//span[@class='tradingsymbol'])[1]")
	private WebElement searchitem;

	@FindBy (xpath ="//button[text()='B ']")
	private WebElement buy;

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
	private WebElement SubmitBuy;
	
	@FindBy (xpath ="(//button[@type='button'])[3]")
	private WebElement cancle;
	
	public SearchPage(WebDriver driver)
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
    public void Buy() {
	
	buy.click();
	System.out.println("1");
    }
	public void  Intraday() {
		
		intraday.click();
		System.out.println("2");
}
    public void  Market() {
		
		market.click();
		System.out.println("3");
}
   public void Limit() {
		
		limit.click();
		System.out.println("4");
    }
    public void LimitStop() {
	
	stoploss.click();
	System.out.println("5");
    }
    public void MarketStop() {
    	
    	marketStopLoss.click();
    	
    	System.out.println("6");
    }
    public void SubmitBuy() {
    	
	 SubmitBuy.click();
	 	
    	System.out.println("7");
    }

    	public void Cancle() {
        	
    		 cancle.click();
    		 	
    	    	System.out.println("8");
}

}    

