package marathon13042023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();

		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.xpath("//td[text()='14']")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		WebElement resultcount = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']"));
		String searchresult = resultcount.getText();
		System.out.println(searchresult);
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		WebElement secondbus = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
		String secondbusname = secondbus.getText();
		System.out.println("Second bus in the result is "+secondbusname);
		String webtitle = driver.getTitle();
		System.out.println("Title of the current page is "+webtitle);
		
	}

}
