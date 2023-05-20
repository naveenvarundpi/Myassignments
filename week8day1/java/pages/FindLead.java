package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class FindLead extends ProjectDepencies{
	public FindLead(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
	public FindLead enterfirstname(String fname)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
		return this;
	}
	public FindLead clickfindleads()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public ViewLead clicklead() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		return new ViewLead(driver);
	}
	public FindLead clickemail()
	{
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}
	public FindLead enteremail(String email)
	{
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(email);
		return this;
	}
	public FindLead clickphonenumber()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLead enterphonenumber(String phonenumber)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		return this;
	}
	public FindLead enterleadid(String id)
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		return this;
	}
	public void verifydeletelead(String id)
	{
		WebElement delete=driver.findElement(By.xpath("//div[text()='No records to display']"));
		String deleted = delete.getText();
		if(deleted.equals("No records to display"))
		{
			System.out.println("Lead "+id+" is deleted");
		}
		else 
		{
			System.out.println(id+" is not deleted");
		}
	}
}
