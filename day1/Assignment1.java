package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test First");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Last");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test First Local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Department");
		driver.findElement(By.name("description")).sendKeys("Test description");
		driver.findElement(By.name("primaryEmail")).sendKeys("naveenkumar@gmail.com");
			Select state=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
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
