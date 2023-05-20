package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectdepencies.ProjectDepencies;

public class TC001 extends ProjectDepencies{

	@BeforeTest
	public void beforeclass()
	{
		excelname="TC001";
		
	}
	@Test(dataProvider ="data")
	public void Login(String username,String Password)
	{
		LoginPage page=new LoginPage(driver);
				page.enterusername(username).enterpassword(Password).clickloginpostive().verifywelcomemessage().clickcrmsfa();
		
	}
	
	
}
