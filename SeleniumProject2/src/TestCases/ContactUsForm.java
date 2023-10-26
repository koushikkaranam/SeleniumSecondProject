package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.ContactUsPageObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class ContactUsForm extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void ContactForm() {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.ContactUs();
		ContactUsPageObjects contact=new ContactUsPageObjects(driver);
		contact.GetinTuch();
		contact.Contactform();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("Home page is visible successfully");
		}else {
			System.out.println("Home page is not visible");
		}
	}
}