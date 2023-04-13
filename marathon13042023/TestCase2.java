package marathon13042023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("hyderabad"))
		{
			System.out.println("City Hydrerabad has been selected ");
		}
		else
		{
			System.out.println("City Hydrerabad has been not been selected ");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//a[text()='Dasara (UA)']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		WebElement firsttheatre = driver.findElement(By.xpath("(//a[@class='__venue-name'])[1]"));
		String theatreresult = firsttheatre.getText();
		System.out.println("First theatre displayed is: "+theatreresult);
		driver.findElement(By.xpath("(//div[@class='info-section'])[1]")).click();
		WebElement parking = driver.findElement(By.xpath("//div[text()='            Parking Facility        ']"));
		boolean parkingdisplayed = parking.isDisplayed();
		if(parkingdisplayed==true)
		{
			System.out.println("Parking is available in this theatre");
		}
		else
		{
			System.out.println("Parking is not available in this theatre");
		}
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("(//div[@class='showtime-pill-container _available'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Accept'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		driver.findElement(By.xpath("//div[@class='bar-btn _primary _full-width _centered']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='B_5_025']")).click();
		driver.findElement(By.xpath("(//a[@class='bar-btn _primary'])[1]")).click();
		WebElement subtotal = driver.findElement(By.xpath("(//span[@id='subTT'])[1]"));
		Thread.sleep(3000);
		String finalsubtotal = subtotal.getText();
		System.out.println("Ticket value is "+finalsubtotal);
		
	}

}
