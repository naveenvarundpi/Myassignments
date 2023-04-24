package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean compare=true;
		//String trainames=null;
		//String trainamesafterclick=null;
		List<String> trainname=new ArrayList<String>();
		List<String> trainnameafterclick=new ArrayList<String>();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
		fromstation.clear();
		fromstation.sendKeys("MS",Keys.TAB);
		WebElement tostation = driver.findElement(By.id("txtStationTo"));
		tostation.clear();
		tostation.sendKeys("MDU",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(5000);
		WebElement tabletrain = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]"));
		List<WebElement> train = tabletrain.findElements(By.tagName("tr"));
		for(int i=1;i<train.size();i++)	
		{
			WebElement traindetails=train.get(i);
			List<WebElement> eachtraindetails = traindetails.findElements(By.tagName("td"));
			for(int j=0;j<eachtraindetails.size();j++)
			{
				WebElement traincolumndetails=eachtraindetails.get(j);
				System.out.println(traincolumndetails.getText());

			}
			trainname.add(eachtraindetails.get(1).getText());
		}	
		System.out.println(trainname);
		//trainnamesorted.addAll(trainname.sort(null))
		Collections.sort(trainname);
		System.out.println(trainname);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Train Name']")).click();
		WebElement tabletrain1 = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]"));
		List<WebElement> train1 = tabletrain1.findElements(By.tagName("tr"));
		for(int i=1;i<train1.size();i++)	
		{WebElement traindetails1=train1.get(i);
		List<WebElement> eachtraindetails1 = traindetails1.findElements(By.tagName("td"));
		trainnameafterclick.add(eachtraindetails1.get(1).getText());
		}	
		System.out.println(trainnameafterclick);
		//boolean containsAll = trainname.equals(trainnameafterclick);
		//System.out.println();
		for(int i=0;i<trainname.size();i++)
		{	
			String trainnames=trainname.get(i);
			String trainnamesafterclick=trainnameafterclick.get(i);
			if (trainnames.equals(trainnamesafterclick)) 
			{
				compare=true;
			}
			else
			{
				compare=false;
				break;
			}
		}
		if(compare==true)
		{
			System.out.println("Both the lists are same");
		}



	}

}
