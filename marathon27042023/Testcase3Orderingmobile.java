package marathon27042023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.sukgu.Shadow;

public class Testcase3Orderingmobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://dev120081.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("$AWWF0/a2afr");
		driver.findElement(By.id("sysverb_login")).click();
		//.get("https://dev120081.service-now.com/");
		driver.navigate().to("https://dev120081.service-now.com/");
		Thread.sleep(10000);
		Shadow shadow=new Shadow(driver);
		shadow.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(5000);
		WebElement servicecatlog = shadow.findElementByXPath("//label[text()='All filter navigator']/following-sibling::input");
		servicecatlog.sendKeys("Service catalog");
		Thread.sleep(1000);
		servicecatlog.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement frame=shadow.findElementByXPath("//iframe[@title='Main Content']");
		 //= driver.findElement(By.xpath());
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//td[@class='homepage_category_only_description_cell'])[8]//span/h2")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		Thread.sleep(3000);
		//WebElement frame1=shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//div[@class='sc-radio']/span)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")).click();
		driver.findElement(By.xpath("//option[@value='unlimited']")).click();
		driver.findElement(By.xpath("(//div[@class='sc-radio']/span)[7]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
		driver.findElement(By.xpath("//button[@data-original-title=\"Order Now\"]")).click();
		String title = driver.getTitle();
		boolean contains = title.contains("Order Status");
		if(contains)
		{
			System.out.println("Order has been placed");
		}
		else
		{
			System.out.println("order has not been placed");
		}
		String requestnumber = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Request number for the order is: "+requestnumber);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/ORDIMG001.png");
		FileUtils.copyFile(screenshotAs,dest);
		/*
6. Choose yes option in lost or broken iPhone
7. Enter phonenumber as 99 in original phonenumber field
8. Select Unlimited from the dropdown in Monthly data allowance
9. Update color field to SierraBlue and storage field to 512GB
10. Click on Order now option
11. Verify order is placed and copy the request number
12.Take a Snapshot of order placed page
		 * */
	}

}
