package TestCases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.CartPageObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.ProductsPageObjects;
import utils.BaseClass;

public class AddProductsToCart extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void AddProductinCart() {
		ProductsPageObjects app=new ProductsPageObjects(driver);
		app.AddToCart();
		MainPageObjects mp=new MainPageObjects(driver);
		mp.Cart();
		CartPageObjects cp=new CartPageObjects(driver);
		cp.ProductDetails();
	}
}