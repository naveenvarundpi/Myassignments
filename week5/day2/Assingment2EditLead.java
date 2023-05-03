package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assingment2EditLead extends BaseClass{
	@Test
	public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
		String updatecompanyname="Testleaf13";
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Firstname");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		String page=driver.getTitle();
		if (page.equals("View Lead | opentaps CRM"))
		{
			System.out.println("View lead page is displayed");
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			WebElement companyname= driver.findElement(By.id("updateLeadForm_companyName"));
			companyname.clear();
			companyname.sendKeys(updatecompanyname);
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String updatedcompanyname=driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(updatedcompanyname);
			if(updatedcompanyname.contains(updatecompanyname))
			{
				System.out.println("Company name is updated");
			}
			else
			{
				System.out.println("Company name is not updated");
			}
		}
		else
		{
			System.out.println("View lead page is not displayed");
		}
	}

}
