package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment2CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Firstname");
		driver.findElement(By.id("lastNameField")).sendKeys("lastname");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Firstnamelocal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("lastnamelocal");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Departmenttest");
		driver.findElement(By.id("createContactForm_description")).sendKeys("descriptiontest");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("naveen@kumar.com");
		WebElement location=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state=new Select(location);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("importantNote");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		if (title.equals("View Contact | opentaps CRM"))
		{
			System.out.println("New Contact Created and Edited");
		}
		else
		{
			System.out.println("New Contact not Created and Edited");
		}


	}

}
