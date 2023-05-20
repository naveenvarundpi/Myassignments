package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class ViewLead extends ProjectDepencies {
	public ViewLead(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
	public EditLead clickedit()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLead(driver);
	}
	public DuplicateLead clickduplicatelead()
	{
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		return new DuplicateLead(driver);
	}
	public void verifycnameupdated(String cname)
	{
		String name=cname;
		String updatedcompanyname=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(updatedcompanyname);
		if(updatedcompanyname.contains(name))
		{
			System.out.println("Company name is updated");
		}
		else
		{
			System.out.println("Company name is not updated");
		}
	}
	public ViewLead verifydup(String email)
	{
		String emailv = driver.findElement(By.xpath("((//table[@class='contactTable']//tr)[2]/td)[2]//a")).getText();
		if(email.contains(emailv))
		{
			System.out.println("Duplicate lead is created");	
		}
		else
		{
			System.out.println("Duplicate lead is not created");
		}
	return this;
	}
	public LeadPage clickdelete()
	{
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		return new LeadPage(driver);
	}

}

