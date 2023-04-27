package week4.day2;

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

public class Assignment4Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("oneplus 9 pro");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion-container']/div)[1]")).click();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		String priceupdate = price.replaceAll("[^0-9]","");
		System.out.println("Price of the product is: "+priceupdate);
		Thread.sleep(3000);
		String rating = driver.findElement(By.xpath("((//div[@class='a-row a-size-small'])[2]/span)[1]")).getAttribute("aria-label");
		System.out.println("Rating of the product is: "+rating );
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']//img)[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wh.get(1));
		
		File screenshotAs = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/IMG001.png");
		FileUtils.copyFile(screenshotAs,dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(6000);
		String subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		String cartprice = subtotal.replaceAll("[^0-9]","");
		String removezero = cartprice.substring(0, (cartprice.length()-2));
		System.out.println("Price in the cart is: "+removezero);
		if(priceupdate.equals(removezero))
		{
			System.out.println("Both product and cart rate are same");
		}
		else
		{
			System.out.println("Both product and cart rate are not same");
		}
		driver.quit();
		/*
		 * 1.Load the URL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Click the first text link of the first image
6. Take a screen shot of the product displayed
7. Click 'Add to Cart' button
8. Get the cart subtotal and verify if it is correct.
9.close the browser
		 * 
		 * */
	}

}
