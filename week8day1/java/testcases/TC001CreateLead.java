package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectdepencies.ProjectDepencies;

public class TC001CreateLead extends ProjectDepencies{

	@BeforeTest
	public void beforeclass()
	{
		excelname="TC001";
		
	}
	@Test(dataProvider = "data")
	public void Login(String companyname,String firstname,String lastname)
	{
		LoginPage page=new LoginPage(driver);
				page.enterusername(username1).enterpassword(password1).clickloginpostive()
				.verifywelcomemessage().clickcrmsfa().clickleads().clickcreatelead().entercompanyname(companyname).enterfirstname(firstname)
				.enterlastname(lastname).clickcreatelead().verifyleadcreated();
		
	}
	
	
}
