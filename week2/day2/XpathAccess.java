package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1 Parent to Child
		driver.findElement(By.xpath("(//form[@id='login']/p)[1]"));
		//2 Grand Parent to Grand Child
		driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("DemoSalesManager");
		//3 Child to Parent
		driver.findElement(By.xpath("//input[@id='username']/parent::p"));
		//4 Grand Child to Grand Parent
		driver.findElement(By.xpath("//input[@id='username']/ancestor::form"));
		//5 Sibling to Sibling(top to bottom)
		driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).clear();
		//6 Sibling to Sibling(bottom to top)
		driver.findElement(By.xpath("//input[@id='username']/preceding-sibling::label"));
		//7 Cousin to Cousin(top to bottom)
		driver.findElement(By.xpath("(//input[@id='username']/following::input)[1]")).sendKeys("crmsfa");
		//8 Cousin to Cousin(bottom to top)
		driver.findElement(By.xpath("//input[@id='password']/preceding::input")).sendKeys("DemoSalesManager1");


	}

}
