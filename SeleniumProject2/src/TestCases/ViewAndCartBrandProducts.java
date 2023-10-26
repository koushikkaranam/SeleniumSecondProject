package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.ProductsPageObjects;
import utils.BaseClass;

public class ViewAndCartBrandProducts extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url = new LaunchURL();
		url.LaunchingURL();
	}

	@Test
	public void ViewCartBrandProducts() throws InterruptedException {
		MainPageObjects mp = new MainPageObjects(driver);
		mp.Product();
		ProductsPageObjects app = new ProductsPageObjects(driver);
		app.BrandsView();
		app.PoloBrand();
		app.HMBrand();
	}
}
