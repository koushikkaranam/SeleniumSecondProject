package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import AllPagesObjects.LaunchURL;
import AllPagesObjects.LoginPageObjects;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class LoginUserWithIncorrectUsernameAndPassword extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void loginwithValidInputs() throws InterruptedException  {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.signupbtn();
        LoginPageObjects lp=new LoginPageObjects(driver);
		lp.LoginMessage();
		lp.UserLogin("qatest1@gmail.com", "abcde");
		lp.ErrorMessage();
	}

}