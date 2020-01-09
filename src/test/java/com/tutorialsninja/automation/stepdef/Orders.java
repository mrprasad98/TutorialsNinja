package com.tutorialsninja.automation.stepdef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {
HeadersSection headessection=new HeadersSection();
LoginPage loginpage=new LoginPage();
SearchResultPage searchresultpage=new SearchResultPage();
ShoppingCartPage shoppingcartpage=new ShoppingCartPage();
CheckOutPage checkoutpage=new CheckOutPage();

	@Given("^I login into application$")
	public void i_login_into_application() {
		Browser.openApplicationUrl();
		HeadersSection.navigateToLoginPage();
		LoginPage.doLogin();
	}

	@When("^I add product to bag and checkout$")
	public void i_add_product_to_bag_and_checkout() throws InterruptedException {
		
		HeadersSection.searchProduct();
		SearchResultPage.addToCartOption();
		HeadersSection.shoppingCartOption();
		Elements.click(ShoppingCartPage.useCouponCode);
		Thread.sleep(3000);
		Elements.TypeText(ShoppingCartPage.enterYourCoupon, Base.reader.getCouponCode());
		Elements.click(ShoppingCartPage.applyCoupon);
		Elements.click(ShoppingCartPage.estimateAndShipping);
		Elements.TypeText(ShoppingCartPage.postCode_Estimateshipping, Base.reader.getPostCode());
		//ShoppingCartPage.checkoutOption();
		//CheckOutPage.guestContinueOption();
		//CheckOutPage.guestAccountOption();
		
		//Elements.click(CheckOutPage.newAddress);
		
		/*Base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(Base.driver, 20);
		WebElement guru;
		guru= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//fieldset[@id='account']/div[2]/input[1]")));
		guru.click();
		//Elements.TypeText(CheckOutPage.first_name_BillingDetails, Base.reader.getfirstname());*/
		
					}
	@And("^Fill Billingdetails$")
	public void fill_Billingdetails(DataTable dataTable_Billing) throws InterruptedException {
	    
		//CheckOutPage.enterBillingDetails(dataTable_Billing, "unique");
	}
	@And("^I Place an Order$")
	public void i_Place_an_Order() {

	}

	@Then("^I should see order placed successfully$")
	public void i_should_see_order_placed_successfully() {

	}

}
