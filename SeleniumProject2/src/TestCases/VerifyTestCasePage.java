package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.TestCasesPageObjects;
import utils.BaseClass;

public class VerifyTestCasePage extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void TestCase() {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.TestCase();
		TestCasesPageObjects tc=new TestCasesPageObjects(driver);
		tc.TestcaseVerification();
	}
}