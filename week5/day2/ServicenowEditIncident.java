package week5.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ServicenowEditIncident extends LoginClassServiceCode {
@Test
public void editincident() throws InterruptedException
{
	Thread.sleep(3000);
	WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
	//WebElement frame = driver.findElement(By.id("gsft_main"));
	driver.switchTo().frame(frame);
	List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='linked formlink']"));
	int size = findElements.size();
	System.out.println(size);
	String text = findElements.get(size-1).getText();
	System.out.println("Incident going to be edited is :"+text);
	WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]"));
	search.sendKeys(text);
	search.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	driver.findElement(By.xpath("//select[@id='incident.urgency']")).click();
	driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
	driver.findElement(By.xpath("//select[@id='incident.state']")).click();
	driver.findElement(By.xpath("(//option[@value='2'])[2]")).click();
	driver.findElement(By.xpath("//button[text()='Update']")).click();
	Thread.sleep(10000);
	//driver.switchTo().frame(frame);
	//search.sendKeys(text);
	//search.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	String incidenturgency = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[1]")).getText();
	String incidentstate = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[2]")).getText();
	System.out.println(incidentstate+" "+incidenturgency);
	if(incidenturgency.equals("1 - High") && incidentstate.contains("In Progress") )
	{
		System.out.println("urency and state updated");
	}
	else
	{
		System.out.println("urency and state not updated");
	}
}
}
