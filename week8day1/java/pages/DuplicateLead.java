package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class DuplicateLead extends ProjectDepencies{
public DuplicateLead(RemoteWebDriver getdriver)
{
	this.driver=getdriver;
}
public ViewLead clickcreatelead()
{
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	return new ViewLead(driver);
}
}
