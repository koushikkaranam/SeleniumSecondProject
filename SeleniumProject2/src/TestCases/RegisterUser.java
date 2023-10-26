package TestCases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.AccountCreationObjects;
import AllPagesObjects.AccountInformation;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.LoginPageObjects;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class RegisterUser extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url = new LaunchURL();
		url.LaunchingURL();
	}

	@Test
	public void Signup() throws InterruptedException {
		MainPageObjects mp = new MainPageObjects(driver);
		mp.signupbtn();
        LoginPageObjects lp = new LoginPageObjects(driver);
		lp.Message();
		lp.UserSignup("Koushik", "Koushik@gmail.com");
		AccountInformation acc = new AccountInformation(driver);
		acc.Message();
		acc.Mr();
        acc.AccuntInformation();
		AccountCreationObjects accCreate = new AccountCreationObjects(driver);
        accCreate.AccountCreatedMessage();
		accCreate.Continuebtn();
        mp.LoginwithUserId();
		mp.Delete();
        accCreate.AccountDeletedMessage();
		accCreate.Continuebtn();
	}

}