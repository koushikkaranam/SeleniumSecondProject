package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.CartPageObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.LoginPageObjects;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.ProductsPageObjects;
import utils.BaseClass;

public class SearchProductsAndVerifyAfterCartLogin extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url = new LaunchURL();
		url.LaunchingURL();
	}

	@Test
	public void SearchBtn() throws InterruptedException {
		MainPageObjects mp = new MainPageObjects(driver);
		mp.Product();
		ProductsPageObjects app = new ProductsPageObjects(driver);
		app.VerifyProducts();
		app.SearchProduct();
		app.AddToCartView();
		mp.Cart();
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.UserLogin("abcde@gmail.com", "abc123D");
		mp.Cart();
		CartPageObjects cp = new CartPageObjects(driver);
		cp.VerifyShoppingCart();
	}
}