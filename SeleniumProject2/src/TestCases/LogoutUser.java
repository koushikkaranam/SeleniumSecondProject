package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.LaunchURL;
import AllPagesObjects.LoginPageObjects;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class LogoutUser extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void loginwithValidInputs() throws InterruptedException  {
		MainPageObjects mp=new MainPageObjects(driver);
        LoginPageObjects lp=new LoginPageObjects(driver);
		lp.LoginMessage();
		lp.UserLogin("qatest2@gmail.com", "abcde");
		mp.LoginwithUserId();
		mp.Logout();
		lp.LoginMessage();
	}


}