package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

//import com.google.common.collect.Ordering;

public class Assignment3SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		Thread.sleep(45000);
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("No of sports shoes are: "+count.replaceAll("[^0-9]", ""));
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		Thread.sleep(10000);
		List<WebElement> shoepriceelement = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<String> shoeprice=new ArrayList<String>();
		for(int i=0;i<shoepriceelement.size();i++)
		{
			String price = shoepriceelement.get(i).getAttribute("display-price");
			shoeprice.add(price);
		}
		System.out.println(shoeprice);
		int sort=0;
		for(int i=0;i<(shoeprice.size()-1);i++)
		{
			String first=shoeprice.get(i);
			String second=shoeprice.get(i+1);
			int compareTo = first.compareTo(second);
			System.out.println(compareTo);
			if(compareTo>0)
			{
				System.out.println("Items are notsorted");
				sort=sort+1;
				break;
			}
		}
		if(sort==0)
		{
			System.out.println("Items are Sorted");
		}
		//8.Select the price range (900-1200) price is available only between 500 to 600 hence not done
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();

		boolean selectednavy = driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).isSelected();
		boolean selectedfashion = driver.findElement(By.xpath("//div[text()='Training Shoes']")).isSelected();
		System.out.println(selectedfashion+""+selectednavy);
		if(selectedfashion && selectednavy)
		{
			System.out.println("All the filters are selected");
		}
		else
		{
			System.out.println("All the filters are not selected");
		}
		Thread.sleep(15000);
		WebElement shoeimage = driver.findElement(By.id("621868725223"));
		boolean displayed = shoeimage.isDisplayed();System.out.println(displayed);
		builder.moveToElement(shoeimage).perform();
		WebElement button = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		builder.click(button).perform();
		Thread.sleep(3000);
		String act = driver.findElement(By.xpath("(//div[@class='lfloat']//span)[1]")).getText();
		System.out.println("Actual Price is: "+act);
		String discprice = driver.findElement(By.xpath("(//div[@class='lfloat']//span)[2]")).getText();
		System.out.println("Discount Price is: "+discprice);
		String disc = driver.findElement(By.xpath("(//div[@class='lfloat']//span)[3]")).getText();
		String discper = disc.replaceAll("[A-Z]","");
		System.out.println("Discount Percentage is: "+discper);
		File screenshotAs = driver.findElement(By.xpath("//img[@itemprop='image']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/IMGsnap001.png");
		FileUtils.copyFile(screenshotAs,dest);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		//span[@class='percent-desc']
		/*
		 * 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main windowxx`x`
		 * */
	}

}
