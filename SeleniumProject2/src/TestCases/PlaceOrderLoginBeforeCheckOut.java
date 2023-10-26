package TestCases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllPagesObjects.AccountCreationObjects;
import AllPagesObjects.AccountInformation;
import AllPagesObjects.CartPageObjects;
import AllPagesObjects.LaunchURL;
import AllPagesObjects.LoginPageObjects;
import AllPagesObjects.MainPageObjects;
import AllPagesObjects.PaymentPageObjects;
import AllPagesObjects.ProductsPageObjects;
import utils.BaseClass;

public class PlaceOrderLoginBeforeCheckOut extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void RegisterWhileCheckout() throws InterruptedException {
		ProductsPageObjects app=new ProductsPageObjects(driver);
		app.AddToCart();
		
		MainPageObjects mp=new MainPageObjects(driver);
		mp.Cart();
		CartPageObjects cp=new CartPageObjects(driver);
		cp.ProceedToCheckout();
	
		cp.Register();
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.UserSignup("abcde", "abcde@gmail.com");
		AccountInformation ai=new AccountInformation(driver);
		ai.Mr();
		ai.AccuntInformation();
		
		AccountCreationObjects acc=new AccountCreationObjects(driver);
		acc.AccountCreatedMessage();
		mp.LoginwithUserId();
		mp.Cart();
		cp.ProceedToCheckout();
		cp.AddressDetails();
		cp.ReviewurOrder();
        cp.Message();
		cp.PlaceOrder();
		PaymentPageObjects pp=new PaymentPageObjects(driver);
		pp.Payment();
        pp.OrderConfirmation();
        mp.Delete();
		acc.AccountDeletedMessage();
	}
}