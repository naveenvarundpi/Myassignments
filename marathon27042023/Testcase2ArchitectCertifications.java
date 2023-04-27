package marathon27042023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Testcase2ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wh.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		Shadow shadow =new Shadow(driver);
		WebElement learning = shadow.findElementByXPath("//span[text()='Learning']");
		learning.click();
		WebElement learningontrailhead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder=new Actions(driver); 
		builder.moveToElement(learningontrailhead).perform();
		WebElement salesforcecertification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		salesforcecertification.click();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item '])[1]")).click();
		System.out.println("Salesforce Architect certifications are: ");
		List<WebElement> certification = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for(int i=0;i<certification.size();i++)
		{
			String certficationname = certification.get(i).getText();
			System.out.println("Certifications name :"+certficationname);
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		System.out.println("Application Architect certifications are: ");
		List<WebElement> appcertification = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for(int i=0;i<appcertification.size();i++)
		{
			String certficationname = appcertification.get(i).getText();
			System.out.println("Certifications name :"+certficationname);
		}
		List<WebElement> screenshot = driver.findElements(By.xpath("//div[@class='credentials-card ']"));
		for(int i=0;i<screenshot.size();i++)
		{
			Thread.sleep(2000);
			WebElement webElement = screenshot.get(i);
			//driver.switchTo().Element();
			Actions builder1=new Actions(driver); 
			builder1.scrollToElement(webElement).perform();
			File screenshotAs = webElement.getScreenshotAs(OutputType.FILE);
			File dest=new File("./snaps/ARCHCERIMG00"+i+".png");
			FileUtils.copyFile(screenshotAs,dest);
		}
		


	}

}
