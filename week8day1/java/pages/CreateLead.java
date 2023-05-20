package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class CreateLead extends ProjectDepencies{
	public CreateLead(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
	public CreateLead entercompanyname(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
	public CreateLead enterfirstname(String fname)
	{
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
	public CreateLead enterlastname(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public NewLead clickcreatelead()
	{
		driver.findElement(By.name("submitButton")).click();
		return new NewLead(driver);
	}
}
