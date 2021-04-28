package TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	@BeforeSuite

	public void beforeSuite() {
		System.out.println("TestClass1 before suite");
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("TestClass1 before test");
	}
	

    @BeforeClass
    public void beforeClass() {
	System.out.println("TestClass1 before class");
}

   @BeforeMethod
    public void beforemethod() {
	System.out.println("TestClass1 before method");
}

   @Test
    public void test1() {
	System.out.println("TestClass1 before test1");
}

   @Test
    public void test2() {
	System.out.println("TestClass1 before test2");
}
   @Test
   public void test3() {
	System.out.println("TestClass1 before test3");
}
   @Test
   public void test4() {
	System.out.println("TestClass1 before test4");
}
   @AfterMethod
   public void aftermethod() {
	System.out.println("TestClass1 after method");
}

   @AfterClass
   public void afterClass() {
	System.out.println("TestClass1 after class ");
}

   @AfterTest
   public void afterTest() {
	System.out.println("TestClass1 after test ");
}

   @AfterSuite
   public void aftersuite() {
	System.out.println("TestClass1 after suite ");
}
}