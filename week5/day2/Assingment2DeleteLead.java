package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assingment2DeleteLead extends BaseClass {
	@Test
	public  void deleteLead() throws Exception {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement lead=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]"));
		String leadid=lead.getText();
		System.out.println(leadid);
		lead.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement delete=driver.findElement(By.xpath("//div[text()='No records to display']"));
		String deleted = delete.getText();
		if(deleted.equals("No records to display"))
		{
			System.out.println("Lead "+leadid+" is deleted");
		}
		else 
		{
			System.out.println(leadid+" is not deleted");
		}
		driver.close();

	}


}
