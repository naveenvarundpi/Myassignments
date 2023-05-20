package projectdepencies;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readata.ReadExcelData;


public class ProjectDepencies {
	public String excelname;
	public RemoteWebDriver driver;
	@Parameters({"browser","url"})
	@BeforeMethod
	public void precondition(String browser,String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	@DataProvider(name="data")
	public String[][] readdata() 
	{
		return ReadExcelData.readexceldata(excelname);
		
		
	}
	

}
