package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class NewLead extends ProjectDepencies {
	public NewLead(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
public void verifyleadcreated()
{
	String title = driver.getTitle();
	if (title.equals("View Lead | opentaps CRM"))
	{
		System.out.println(title);
		System.out.println("New Lead Created");
	}
	else 
	{
		System.out.println("New Lead not Created");	
	}
	
}
}
