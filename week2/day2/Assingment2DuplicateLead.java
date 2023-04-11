package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("naveenkumar@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]"));
		String firstname = name.getText();
		System.out.println(firstname);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title=driver.getTitle();
		if(title.contains("Duplicate Lead"))
		{
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			String dupfirstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println("Dup First name :"+dupfirstname);
			if(firstname.equals(dupfirstname))
			{
				System.out.println("Duplicate lead is created");
			}
			else
			{
				System.out.println("Duplicate lead is not created");
			}
		}
		else 
		{
			System.out.println("Duplicate page not displayed");	
		}

	}

}
