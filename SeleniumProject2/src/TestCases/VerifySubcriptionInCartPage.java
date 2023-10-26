package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class VerifySubcriptionInCartPage extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void Subscription() {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.Cart();
		mp.Subscription();
	}

}