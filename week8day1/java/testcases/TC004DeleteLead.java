package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectdepencies.ProjectDepencies;

public class TC004DeleteLead extends ProjectDepencies{
	@BeforeTest
	public void beforeclass()
	{
		excelname="TC004";
		
	}
	@Test(dataProvider = "data")
	public void Login(String id,String phonenumber) throws InterruptedException
	{
		LoginPage page=new LoginPage(driver);
				page.enterusername(username1).enterpassword(password1).clickloginpostive()
				.verifywelcomemessage().clickcrmsfa().clickleads().clickfindlead().clickphonenumber()
				.enterphonenumber(phonenumber).clickfindleads().clicklead().clickdelete()
				.clickfindlead().enterleadid(id).clickfindleads().verifydeletelead(id);
		
	}
}
