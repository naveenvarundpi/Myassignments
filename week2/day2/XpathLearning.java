package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathLearning {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Test Company");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test First");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test Last");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Test First Local");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Test Department");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test description");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("naveenkumar@gmail.com");
		Select state=new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("(//input[@name='submitButton'])")).click();
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
