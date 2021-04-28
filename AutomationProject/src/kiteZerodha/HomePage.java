package kiteZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	   WebDriver driver;
		
		@FindBy (xpath =" //span[text()='Dashboard']")
		private WebElement dashboard;
			
	    @FindBy (xpath ="  //span[text()='Orders']")
        private WebElement orders;
	    
	    @FindBy (xpath =" (//span[text()='Orders'])[2]")
        private WebElement orders1;
	    
	    @FindBy (xpath ="//span[text()='GTT']")
        private WebElement GIT;
	    

		@FindBy (xpath =" //span[text()='Baskets']")
		private WebElement baskets;
			
	    @FindBy (xpath ="//span[text()='SIP']")
        private WebElement SIP;
	    
	    @FindBy (xpath ="(//span[text()='Holdings'])[1]")
        private WebElement holdings;
	    
	    @FindBy (xpath ="(//span[text()='Holdings'])[2]")
        private WebElement holdings1;
	    
	    @FindBy (xpath ="//select[@placeholder='All stocks']")
		private WebElement stocks;
			
	    @FindBy (xpath ="//span[text()='Positions']")
        private WebElement position;
	    
	    @FindBy (xpath ="//span[text()='Funds']")
        private WebElement funds;
	    
	    @FindBy (xpath =" //button[@class='button-green']")
        private WebElement AddFunds;
	    
	    @FindBy (xpath =" //a[@class='button button-blue'")
		private WebElement withdraw;
			
	    @FindBy (xpath =" //span[text()='Apps'")
        private WebElement apps;
	    
	    @FindBy (xpath ="  (//button[@type='button'])[3]")
        private WebElement marketdepth;
	    
	    @FindBy (xpath =" (//button[@type='button'])[4]")
        private WebElement chart;
	    
	    @FindBy (xpath ="(//button[@type='button'])[5]")
        private WebElement delete;
	    
	    @FindBy (xpath ="(//button[@type='button'])[6]")
        private WebElement more;
	    

		public HomePage(WebDriver driver)
		{ 
		      this.driver = driver;
	        PageFactory.initElements(driver, this);
		}
		
		public void dashBoard() 
		{
			dashboard.click();
			
		}
		
		public void orders() 
		{
			orders.click();
			
		}
		
		public void orders1() 
		{
			orders1.click();
			
		}
		
		public void gIT() 
		{
			GIT.click();
			
		}
		
		public void basKets() 
		{
			baskets.click();
			
		}
		
		public void sIP() 
		{
			SIP.click();
			
		}
		
		public void holDings() 
		{
			holdings.click();
			
		}
		
		public void holDings1() 
		{
			holdings1.click();
			
		}
		
		public void stocks() 
		{
			stocks.click();
			
		}
		
		public void position() 
		{
			position.click();
			
		}
		
		public void funds() 
		{
			funds.click();;
			
		}
		
		public void addFunds() 
		{
			AddFunds.click();
		}
		
		public void withDraw() 
		{
			withdraw.click();
			
		}
		
		public void apps() 
		{
			apps.click();
			
		}
		
		public void marketDepth() 
		{
			marketdepth.click();
			
		}
		
		public void chart() 
		{
			chart.click();
			
		}
		
		public void delete() 
		{
			delete.click();
			
		}
		
		public void more() 
		{
			more.click();
			
		}

	    
	    


}
