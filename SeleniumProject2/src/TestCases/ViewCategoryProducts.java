package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.ProductsPageObjects;
import utils.BaseClass;

public class ViewCategoryProducts extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url = new LaunchURL();
		url.LaunchingURL();
	}

	@Test
	public void ViewCategoryProducts() throws InterruptedException {
		MainPageObjects mp = new MainPageObjects(driver);
		mp.Categoryview();
		mp.WomenProducts();
		ProductsPageObjects app = new ProductsPageObjects(driver);
		app.WomenProducts();
		mp.MenProducts();
		app.MenProducts();
	}
}