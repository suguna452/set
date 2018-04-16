import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import freecrm.lOGINTest;

public class fullsearchTest extends lOGINTest{
  @Test (priority=3)
  public void f3() throws InterruptedException {
	  driver.switchTo().frame("mainpanel");
	   Actions act=new Actions(driver);
	  WebElement ele=driver.findElement(By.xpath("//a[text()='Tasks']"));
	  act.moveToElement(ele).build().perform();
	  driver.findElement(By.xpath("//a[text()='New Task']//following::li[1]")).click();
	  Thread.sleep(2000);
	  /*driver.findElement(By.xpath("(//a[text()='Full Search Form'])[4]")).click();*/
	  
	  driver.findElement(By.xpath("//input[@name='cs_keyword']")).sendKeys("wexos informatica");
	  
	     WebElement e11= driver.findElement(By.xpath("//select[@name='cs_priority']"));
		 e11.click();
		 Thread.sleep(2000);
		 Select se12 =new Select(e11);
		 se12.selectByVisibleText("Normal");
		 Thread.sleep(2000);
		 
	/*	 driver.findElement(By.id("fieldId_cs_created_at_from")).click();
		 driver.findElement(By.id("f_trigger_c_cs_created_at_from")).click();
		 driver.findElement(By.xpath("(//div[@unselectable='on'])[6]")).click();
		 driver.findElement(By.xpath("(//td[text()='17'])[2]")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='cs_created_at_to']")).click();
		 driver.findElement(By.xpath("//img[@id='f_trigger_c_cs_created_at_to']")).click();
		// driver.findElement(By.xpath("(//div[@unselectable='on'])[41]")).click();
		// driver.findElement(By.xpath("(//td[text()='21'])[10]")).click();
*/		 while(true)
		 {
			 try {
				 driver.findElement(By.xpath(".//*[@id='f_trigger_c_cs_created_at_from']")).click();
				 driver.findElement(By.xpath("//div[text()='»']")).click();
				 driver.findElement(By.xpath("//td[text()='11']")).click();
				 break;
				 
				  
					
					
					
				 }catch(Exception e1) {
					 
					 
				 }finally {
					 driver.findElement(By.xpath(".//*[@id='f_trigger_c_cs_created_at_to']")).click();
					 driver.findElement(By.xpath("(//div[text()='»'])[2]")).click();
					 driver.findElement(By.xpath("(//td[text()='13'])[4]")).click();
				 }}

			
				 try {
			       driver.findElement(By.xpath(".//*[@id='f_trigger_c_cs_last_modified_from']")).click();
			       driver.findElement(By.xpath("(//td[text()='11'])[3]")).click();
				 }catch(Exception e2) {
					 
					 
					 
					 e2.printStackTrace();
					 
				 }finally {
					 driver.findElement(By.xpath(".//*[@id='f_trigger_c_cs_last_modified_to']")).click();
					 driver.findElement(By.xpath("(//td[text()='14'])[8]")).click();
				 }
			
		 }
		 
		
  }



			 
		 
  

