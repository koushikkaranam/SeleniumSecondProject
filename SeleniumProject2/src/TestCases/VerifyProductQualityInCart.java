package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.CartPageObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.ProductsPageObjects;
import utils.BaseClass;

public class VerifyProductQualityInCart extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void ProductQuantity() throws InterruptedException {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.ViewProduct();
		ProductsPageObjects app=new ProductsPageObjects(driver);
		app.Quantity();
        mp.Cart();
        CartPageObjects cp=new CartPageObjects(driver);
		cp.Quantity();
	}
}