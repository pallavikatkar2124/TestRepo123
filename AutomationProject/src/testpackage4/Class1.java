package testpackage4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver88\\chromedriver.exe");
		                                              
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.selenium.dev/downloads/");
		driver.navigate().to("https://www.facebook.com/r.php");
		Thread.sleep(5000);
		
		//driver.manage().window().maximize();
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='u_0_n_2R']"));
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='u_0_p_6y']"));
		Thread.sleep(5000);
		firstName.sendKeys("pallavi");
		lastName.sendKeys("class");
		
		
		
		/*driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();*/
				//input[@id='u_0_n']
		//input[@id='u_0_p']
	}
	}


