package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectdepencies.ProjectDepencies;

public class TC003DuplicateLead extends ProjectDepencies{
	
	@BeforeTest
	public void beforeclass()
	{
		excelname="TC003";
		
	}
	@Test(dataProvider = "data")
	public void Login(String email) throws InterruptedException
	{
		LoginPage page=new LoginPage(driver);
				page.enterusername(username1).enterpassword(password1).clickloginpostive()
				.verifywelcomemessage().clickcrmsfa().clickleads().clickfindlead().clickemail().enteremail(email)
				.clickfindleads().clicklead().clickduplicatelead().clickcreatelead().verifydup(email);
		
	}

}
