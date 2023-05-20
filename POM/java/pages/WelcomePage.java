package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class WelcomePage extends ProjectDepencies{

	public WelcomePage(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
	public LoginPage clicklogout()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	public HomePage clickcrmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	public WelcomePage verifywelcomemessage() {
		boolean contains = driver.findElement(By.tagName("h2")).getText().contains("Welcome");
		if(contains)
		{
			System.out.println("Welcome Message Verified");
		}
		else
		{
			System.out.println("Welcome Message not Verified");
		}
		return this;
	}
}