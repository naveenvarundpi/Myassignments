package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class LoginClassServiceCode {
	public ChromeDriver driver;
	//public String newincidentnumber; 
	public Shadow shadow;
	@BeforeMethod
	public void login() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.get("https://dev99362.service-now.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("Varun@1kannan");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	//driver.navigate().to("https://dev99362.service-now.com");
	Thread.sleep(10000);
	
	shadow=new Shadow(driver);
	//shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	Thread.sleep(5000);
	//shadow.setImplicitWait(30);
	WebElement servicecatlog = shadow.findElementByXPath("//label[text()='All filter navigator']/following-sibling::input");
	servicecatlog.sendKeys("Incident");
	//shadow.setImplicitWait(30);
	Thread.sleep(1000);
	servicecatlog.sendKeys(Keys.ENTER);
	//Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close()
	{
		//driver.findElement(By.xpath(newincidentnumber))
		driver.quit();
	}
}
