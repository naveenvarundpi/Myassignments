package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ServicenowNewIncident extends LoginClassServiceCode {

	@Test
	public void createnewincident() throws InterruptedException
	{
		Thread.sleep(10000);

		WebElement frame=shadow.findElementByXPath("//iframe[@title='Main Content']");
		//= driver.findElement(By.xpath());
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("incident.short_description")).sendKeys("unable to login");
		String newincidentnumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		System.out.println("Newly created incident number is: "+newincidentnumber);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]"));
		search.sendKeys(newincidentnumber);
		search.sendKeys(Keys.ENTER);
		String incidentnumbersearch = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).getText();
		if(incidentnumbersearch.equals(newincidentnumber))
		{
			System.out.println("Incident created successfully");
		}
		else
		{
			System.out.println("Incident not created");
		}

	}
}
