package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class LeadPage extends ProjectDepencies  {
	public LeadPage(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
public CreateLead clickcreatelead()
{
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLead(driver);
}	
public FindLead clickfindlead()
{
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	return new FindLead(driver);
}
}
