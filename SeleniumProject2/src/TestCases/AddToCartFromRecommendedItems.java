package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.CartPageObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import utils.BaseClass;

public class AddToCartFromRecommendedItems extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void RecommendedItems() {
		MainPageObjects mp=new MainPageObjects(driver);
		mp.RecommendedItem();
		mp.AddtoCart();
		mp.ViewCart();
		CartPageObjects cp=new CartPageObjects(driver);
		cp.ProductDetails();
	}

}