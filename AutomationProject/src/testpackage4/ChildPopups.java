package testpackage4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopups {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirmbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prombox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement linebreak = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		
		Thread.sleep(2000);
		alertbox.click();
		Thread.sleep(2000);
		confirmbox.click();
		Thread.sleep(2000);
		prombox.click();
		Thread.sleep(2000);
		linebreak.click();
		
		
		String mainaddr = driver.getWindowHandle();
		
		System.out.println("addr main page");
		System.out.println(mainaddr);
	 System.out.println("addrs of all");
	 ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles()); //[M1,S4,S3,S2,S1]
	 System.out.println(addrs.get(0));
	 System.out.println(addrs.get(1));
	 System.out.println(addrs.get(2));
	 System.out.println(addrs.get(3));
	 System.out.println(addrs.get(4));
	 
	 
	 String URL;
	  URL = driver.getCurrentUrl();
	  System.out.println("main page   :"  + URL);
	  
	  
	  driver.switchTo().window(addrs.get(1));
	  URL = driver.getCurrentUrl();
	  System.out.println("A1   :"  + URL);
	  
	  
	  driver.switchTo().window(addrs.get(2));
	  URL = driver.getCurrentUrl();
	  System.out.println("A1   :"  + URL);
	  
	  driver.switchTo().window(addrs.get(3));
	  URL = driver.getCurrentUrl();
	  System.out.println("A1   :"  + URL);
	  
	  driver.switchTo().window(addrs.get(4));
	  URL = driver.getCurrentUrl();
	  System.out.println("A1   :"  + URL);
	  
	  
	  
	  
	
		//a[text()='Try it Yourself »'][1]
	
	
}
}