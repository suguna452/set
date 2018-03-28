package freecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tasks extends lOGINTest {
	
  @Test(priority=1)
  public void f1() throws InterruptedException {
	  
	driver.switchTo().frame("mainpanel");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Tasks']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("cs_keyword")).sendKeys("asdfgasfhj");
	driver.findElement(By.name("cs_extended")).sendKeys("dbhskk");
	
	driver.findElement(By.name("cs_completion")).sendKeys("70");
	Thread.sleep(2000);
	WebElement e= driver.findElement(By.xpath("//select[@name='cs_status']"));
	e.click();
	Select sel =new Select(e);
	sel.selectByVisibleText("Complete");
	Thread.sleep(2000);
	WebElement e1= driver.findElement(By.xpath("//select[@name='cs_task_type']"));
	e1.click();
	Select sel1 =new Select(e1);
	sel1.selectByVisibleText("Event");
	Thread.sleep(2000);
	
	driver.findElement(By.name("cs_submit")).click();
	
	
	
	
	
  }
}
