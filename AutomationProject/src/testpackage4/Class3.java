package testpackage4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver88\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-290heu1/login.do");
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
	WebElement loginButton = driver.findElement(By.xpath("//a[@id='loginButton']"));
	
	username.sendKeys("admin");
	password.sendKeys("manager");
	loginButton.click();
	
	Thread.sleep(5000);
	WebElement users = driver.findElement(By.xpath("(//img[@height='98'])[8]"));
	users.click();
	Thread.sleep(5000);
	WebElement createusers = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
	 createusers.click(); 
	 Thread.sleep(5000);
	 WebElement username1 = driver.findElement(By.xpath(" (//input[@type='text'])[1]"));
	 username1.click(); 
	 Thread.sleep(5000);
	username1.sendKeys("pallavi");
	Thread.sleep(5000);
	 WebElement cancle = driver.findElement(By.xpath(" (//input[@type='button'])[3]"));
	 cancle.click(); 
	
	Thread.sleep(5000);
	Alert add = driver.switchTo().alert();
	String a = add.getText();
     System.out.println(a);
      add.accept();
      
      
	
	//img[@class='sizer'][3]
	//input[@type='button'])[3]
	//  (//input[@type='text'])[1]
	//  (//input[@type='button'])[3]
	
      
      
}
}