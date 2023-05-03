package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assingment2DuplicateLead extends BaseClass{
@Test
	public void duplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("jprincy0623@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]"));
		String firstname = name.getText();
		System.out.println(firstname);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title=driver.getTitle();
		if(title.contains("Duplicate Lead"))
		{
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			String dupfirstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println("Dup First name :"+dupfirstname);
			if(firstname.equals(dupfirstname))
			{
				System.out.println("Duplicate lead is created");
			}
			else
			{
				System.out.println("Duplicate lead is not created");
			}
		}
		else 
		{
			System.out.println("Duplicate page not displayed");	
		}

	}

}
