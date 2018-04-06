package freecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lOGINTest {
	protected WebDriver driver;
 /* @Test
  public void f() {
	 // System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("www.google.com");
  }
  */
  @Test(priority=0)
  public void method1() throws InterruptedException
  {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com/index.html");
	  driver.findElement(By.name("username")).sendKeys("gsuguna");
	  driver.findElement(By.name("password")).sendKeys("suguna123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(2000);
	  
  }
}
