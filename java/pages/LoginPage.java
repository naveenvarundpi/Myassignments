package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import projectdepencies.ProjectDepencies;

public class LoginPage extends ProjectDepencies {
	public LoginPage(RemoteWebDriver getdriver)
	{
		this.driver=getdriver;
	}
	public LoginPage enterusername(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public LoginPage enterpassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePage clickloginpostive()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	public LoginPage clickloginnegative()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}

}
