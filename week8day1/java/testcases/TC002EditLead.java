package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectdepencies.ProjectDepencies;

public class TC002EditLead extends ProjectDepencies{

	@BeforeTest
	public void beforeclass()
	{
		excelname="TC002";
		
	}
	@Test(dataProvider = "data")
	public void Login(String companyname,String firstname) throws InterruptedException
	{
		LoginPage page=new LoginPage(driver);
				page.enterusername(username1).enterpassword(password1).clickloginpostive()
				.verifywelcomemessage().clickcrmsfa().clickleads().clickfindlead().enterfirstname(firstname)
				.clickfindleads().clicklead().clickedit().editcompanyname(companyname).clickupdate().verifycnameupdated(companyname);
		
	}
}
