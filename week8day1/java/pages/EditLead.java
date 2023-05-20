package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class EditLead extends ProjectDepencies{
	public EditLead(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
	public EditLead editcompanyname(String cname)
	{
		WebElement companyname= driver.findElement(By.id("updateLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys(cname);
		return this;
	}
	public ViewLead clickupdate()
	{
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		return new ViewLead(driver);
	}
	
}
