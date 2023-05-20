package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class HomePage extends ProjectDepencies{
public HomePage(RemoteWebDriver getdriver)
{
	this.driver=getdriver;
}
public LeadPage clickleads()
{
	driver.findElement(By.linkText("Leads")).click();
	return new LeadPage(driver);
}
}
