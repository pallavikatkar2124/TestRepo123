package testpackage4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("(//table[@id='customers']"));
		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int a = row.size();
		for(int i = 1; i<=a; i++)
		{
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			int b= col.size();
			for(int j = 0; j<b; j++)
			{
			System.out.println(col.get(j).getText());
		}

}
	}
}
