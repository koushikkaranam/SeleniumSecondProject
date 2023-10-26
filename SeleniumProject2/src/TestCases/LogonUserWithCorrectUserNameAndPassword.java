package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.AccountCreationObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.LoginPageObjects;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class LogonUserWithCorrectUserNameAndPassword extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void loginwithValidInputs() throws InterruptedException {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.signupbtn();
        LoginPageObjects lp=new LoginPageObjects(driver);
		lp.LoginMessage();
		lp.UserLogin("Koushik@gmail.com", "123456");
		mp.LoginwithUserId();
		mp.Delete();
		AccountCreationObjects acc=new AccountCreationObjects(driver);
		acc.AccountDeletedMessage();
	}
}