package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment1 {
	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Firstname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Surname");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567899");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("P@ssword22");
		WebElement dob=driver.findElement(By.xpath("//select[@id='day']"));
		Select date=new Select(dob);
		date.selectByVisibleText("10");
		WebElement dobm=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(dobm);
		month.selectByVisibleText("Sep");
		WebElement doby=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(doby);
		year.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		

	}

}
