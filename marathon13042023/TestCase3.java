package marathon13042023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		String totalsearchresult = result.getText();
		String[] split = totalsearchresult.split(" ");
		/*for (int i=0;i<split.length;i++)
		{
			System.out.println(i+" "+split[i]);
		}*/
		Thread.sleep(3000);
		System.out.println("Total results for bags for boys is "+split[3]);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='p_89-title']/following-sibling::ul/li//span//a//span)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='p_89-title']/following-sibling::ul/li//span//a//span)[6]")).click();
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement bag= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		System.out.println("Name of the bag is: "+bag.getText());
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		
		String discountedprice = price.getText();
		System.out.println("discounted price of the bag is: "+discountedprice);
		driver.close();


	}

}
