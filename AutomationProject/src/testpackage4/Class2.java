package testpackage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Class2 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\AUTOMATION\\\\chromedriver88\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.navigate().to("https://www.facebook.com/r.php");
		Thread.sleep(5000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);   // index=0,1,2,3
		s.selectByIndex(2);           // html text
		
		s.selectByVisibleText("5");    // attribute value
		
		s.selectByValue("2");
		
     
		
	//	http://desktop-290heu1/login.do
}
}