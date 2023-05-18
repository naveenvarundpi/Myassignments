package steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public ChromeDriver driver;

	static String text=null; 
	static String textdash=null; 
	static String indname=null;
	static String accname=null;
	@Given("Open the chrome browser")
	public void openbrowser()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@And("load the application url")
	public void loadurl()
	{
		driver.get("https://login.salesforce.com ");
	}
	@And("Enter the username and password")
	public void enterusernameandpassword()
	{
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	}
	@And("Click on the login button")
	public void clicklogin()
	{
		driver.findElement(By.id("Login")).click();
	}
	@And("Click on the toggle menu button from the left corner")
	public void clicktogglemenu()
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@And("Click view All")
	public void clickviewall() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@And ("click Sales from App Launcher")
	public void clicksalesapplauncher()
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();	
	}
	@And ("Click on Opportunities tab")
	public void clickonopportunities()
	{
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none']")).click();	
	}
	@And ("Click on New button in Opportunity")
	public void clickonnewopportunity() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='New Opportunity']")).click();
		driver.findElement(By.xpath("(//*[name()='svg' and @class='slds-icon slds-icon-text-default slds-icon_x-small']  //*[local-name()='path'])[1]")).click();
	}
	@And ("Enter Opportunity name as {string}")
	public void enteropprtunityname(String oppname) throws InterruptedException
	{
		Thread.sleep(15000);
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div")).sendKeys(oppname);
	}
	@And ("Get the text and  Store it")
	public void gettext()
	{
		//text = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div")).getv;
		text="Salesforce Automation by Naveen";
		System.out.println("typed text is :"+text);
	}
	@And ("Choose close date as Today")
	public void chooseclosedate() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
	}
	@And ("Select Stage as {string}")
	public void selectstage(String stage)
	{
		driver.findElement(By.xpath("//label[text()='Stage']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
	}
	@When ("click Save")
	public void clicksave()
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}
	@Then ("VerifyOppurtunity Name")
	public void verifyoppurtunityname()
	{
		String oppname = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if(text.equals(oppname))
		{
			System.out.println("Oppurtuniy names are same");
		}
		else
		{
			System.out.println("Oppurtuniy names are not same");
		}

	}
	@But ("Verify the Alert message")
	public void verifyalertmessage()
	{
		String message = driver.findElement(By.xpath("//strong[text()='Review the following fields']")).getText();
		WebElement iserror1 = driver.findElement(By.xpath("//a[@data-index='0']"));
		WebElement iserror2 = driver.findElement(By.xpath("//a[@data-index='1']"));
		WebElement iserror3 = driver.findElement(By.xpath("//a[@data-index='2']"));
		boolean errordisplayed1 = iserror1.isDisplayed();
		boolean errordisplayed2 = iserror2.isDisplayed();
		boolean errordisplayed3 = iserror3.isDisplayed();
		String error1 = iserror1.getText();
		String error2 = iserror2.getText();
		String error3 = iserror3.getText();
		if(errordisplayed1 & errordisplayed2 & errordisplayed3 )
		{
			System.out.println("Error message is displayed");
			System.out.println(message);
			System.out.println(error1);
			System.out.println(error2);
			System.out.println(error3);
		}
		else
		{
			System.out.println("Error message is not displayed");
		}
		driver.close();
	}
	@And ("click Dashboards from App Launcher")
	public void clickdashboard()
	{
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Dash");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	}
	@And ("Click on the New Dashboard option")
	public void clicknewdashboard()
	{
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	}
	@And ("Enter Name as {string} and Click on Create")
	public void enternameandclickcreate(String dname) throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement findElement = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys(dname);
		textdash=dname;
		driver.findElement(By.id("submitBtn")).click();

	}
	@When ("Click on Save")
	public void clicksavedash() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
	}
	@Then ("Verify Dashboard name")
	public void verifydashboardname()
	{
		String dashverify = driver.findElement(By.xpath("//span[@class='slds-page-header__title slds-truncate']")).getText();
		if(textdash.equals(dashverify))
		{
			System.out.println("New Dashboard is created");
		}
		else
		{
			System.out.println("New Dashboard is created");
		}
	}
	@And ("click Individual from App Launcher")
	public void clickindividual()
	{
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Ind");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		//div[@title='New']
	}
	@And ("Click on New Individual")
	public void clicknewindividual() 
	{
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	@And ("Enter the Last Name as {string}")
	public void enterlastname(String lname)
	{
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
		indname=lname;
	}
	@When ("Click saveind")
	public void clicksaveind()
	{
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	}
	@Then ("verify Individuals Name")
	public void verifyindividualname() throws InterruptedException
	{
		Thread.sleep(5000);
		String ind = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]")).getText();
		if(ind.equals(indname))
		{
			System.out.println("New individual has been created");
		}
		else
		{
			System.out.println("New individual has not been created");
		}
		driver.close();

	}
	@And ("Click on Accounts tab")
	public void clickaccountstab() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//a[@title='Accounts']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", findElement);
	}
	@And ("Click on New button")
	public void clicknewbutton()
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@And ("Enter {string} as account name")
	public void enteraccountname(String accname1)
	{
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accname1);
		accname=accname1;
	}
	@And ("Select Ownership as Public")
	public void selectownership() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='combobox-button-288']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();
	}
	@When ("Click saveAcc")
	public void clicksaveacc()
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Then ("verify Account name")
	public void verifyaccountname() throws InterruptedException
	{
		Thread.sleep(5000);
		String accnameverify = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']")).getText();
		if (accnameverify.equals(accname)) 
		{
			System.out.println("New account has been created");
		}
		else
		{
			System.out.println("New account has not been created");
		}
		driver.close();
	}

}
