package TestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestClass {
	
	@Test
	public void test1()
	{
		System.out.println("This is test Case1");
	}

	@Test
	public void test2()
	{
		System.out.println("This is test case2");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This will execute before every method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This will execute after every method");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This will execute before the class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This will execute after the class");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This will execute before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This will execute after the suite");
	}
}
