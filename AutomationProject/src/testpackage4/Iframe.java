package testpackage4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));

		Thread.sleep(2000);
		alertbox.click();
		
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles()); //[M1,S4,S3,S2,S1]

		driver.switchTo().window(addrs.get(1));
		
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame("iframeResult");
		
	//	WebElement iframe = driver.findElement(By.xpath("//*[@id='iframeResult']"));
		

		//driver.switchTo().frame("iframe1");
		//driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		
		WebElement tryItButton = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryItButton.click();
		

		
}
}





