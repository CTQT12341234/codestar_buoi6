package mavenproject_day6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test
public class NewTest {
 

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
	  //khoi tao, bat firefoc
	  driver = new FirefoxDriver();
	  //truyen url
	  driver.get("https://www.google.com/");
	  //mo full man hinh
	  driver.manage().window().maximize();
	  
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }
  
  @Test(priority=2)
  public void Testcase1() {
	  System.out.println("test f1 class");
	  driver.findElement(By.id("APjFqb")).clear();
	  driver.findElement(By.id("APjFqb")).sendKeys("Selenium automation test");
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	  try
	  {
		  Thread.sleep(2000);
		  
	  }
	  catch (InterruptedException e)
	  {
		  e.printStackTrace();
	  }
  }
  
  @Test(priority=1)
  @Ignore
  public void Testcase2() {
	  System.out.println("test f2 class");
  }
  
  @Test(priority=3)
  public void Testcase3() {
	  System.out.println("test f3 class");
  }
  
  @Test(priority=3)
  public void Testcase7() {
	  driver.findElement(By.xpath("//input[@id=\"login_username\"]"));
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Before class");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Before class");
	  driver.quit();
	  
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuit class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Before class");
  }
  
}
