package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> securitynames=new ArrayList<String>();
		Set<String> uniquesecuritynames=new LinkedHashSet<String>();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("(//div[@class='table-responsive']//table)[1]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			WebElement rowdata = rows.get(i);
			List<WebElement> eachrow = rowdata.findElements(By.tagName("td"));
			securitynames.add(eachrow.get(0).getText());
		}
		System.out.println(securitynames);
		uniquesecuritynames.addAll(securitynames);
		for(String each:uniquesecuritynames)
		{
			System.out.println(each);
		}
		
	}
/*
 * 1. Launch the URL https://www.chittorgarh.com/
2. Click on stock market
3. Click on NSE bulk Deals
4. Get all the Security names
5. Ensure whether there are duplicate Security names
 * */
}
