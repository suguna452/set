package freecrm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTasksTest extends lOGINTest {
  @Test(priority=2)
  public void f2() throws InterruptedException {
	  driver.switchTo().frame("mainpanel");
	  Actions act=new Actions(driver);
	  WebElement ele=driver.findElement(By.xpath("//a[text()='Tasks']"));
	  act.moveToElement(ele).build().perform();
	  driver.findElement(By.xpath("//a[text()='New Task']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("title")).sendKeys("suguna");
	  driver.findElement(By.xpath(".//*[@id='f_trigger_c_deadline']")).click();
	  driver.findElement(By.xpath("(//td[text()='6'])[1]")).click();
	  driver.findElement(By.name("auto_extend")).click();
	  driver.findElement(By.xpath("(//input[@class='button_help'])[1]")).click();
	 
	  
     // Alert s1=driver.switchTo().alert();
    //  Thread.sleep(2000);
     // s1.dismiss();
//	  driver.findElement(By.xpath("//input[@type='button']")).click();
	  
	 Set< String> se=driver.getWindowHandles();
	 Iterator<String> se1=se.iterator();
	 String  parentId=se1.next();
	 String childId=se1.next();
	 driver.switchTo().window(childId);
	 Thread.sleep(2000);
	 driver.close();
	 driver.switchTo().window(parentId);
	 driver.switchTo().frame("mainpanel");
	 Thread.sleep(2000);
	 
	 WebElement e1= driver.findElement(By.xpath("//select[@name='status']"));
	 e1.click();
	 Thread.sleep(2000);
	 Select se2 =new Select(e1);
	 se2.selectByVisibleText("Complete");
	 Thread.sleep(2000);

		  
		  driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
		  Set< String> se11=driver.getWindowHandles();
		  Iterator<String> se21 =se11.iterator();
		 String  parentId1=se21.next();
		 String childId1=se21.next();
		 driver.switchTo().window(childId1);
		
		 
		 driver.findElement(By.id("search")).sendKeys("aaaaaaaaaaaad");
		 driver.findElement(By.xpath(("//input[@type='submit']"))).click();
		 driver.close();
		 driver.switchTo().window(parentId1);
		 driver.switchTo().frame("mainpanel");
		 
	  /*driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("//input[@type='button']")).click();*/
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	  
	 

  }
}
