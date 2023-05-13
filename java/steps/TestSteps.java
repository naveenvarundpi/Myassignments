package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	ChromeDriver driver;
	@Given("Open the chrome browser")
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@And("load the application url")
	public void loadurl()
	{
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	@And("Enter the username")
	public void enterusername()
	{
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
	}
	@And("Enter the password")
	public void enterpassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@And("Click on the login button")
	public void clicklogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("ClickCRMSFALINK")
	public void clickcrmlink() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("click Leads menu")
	public void clicklead()
	{
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	@And("Click Create Lead")
	public void clickcreatelead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("Enter the Companyname as {string}")
	public void entercompanyname(String companyname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@And("Enter the firstname as {string}")
	public void enterfirsrname(String firstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		
	}
	@And("Enter the Lastname as {string}")
	public void enterlastname(String lastname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@When("Click Createlead button")
	public void clickcreateleadbutton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Verify that the new lead is created")
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
