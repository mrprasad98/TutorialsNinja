package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ShoppingCartPage {

	public ShoppingCartPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(css="a[class$='btn-primary']")
	public static WebElement checkout;
	@FindBy(xpath="//div[@id='accordion']/div/div[1]/h4/a")
	public static WebElement useCouponCode;
	
	@FindBy(id="input-coupon")
	public static WebElement enterYourCoupon;
	@FindBy(id="button-coupon")
	public static WebElement applyCoupon;
	@FindBy(xpath="//div[@id='accordion']/div[2]/div[2]/div/div/div[3]")
	public static WebElement estimateAndShipping;
	@FindBy(id="input-postcode")
	public static WebElement postCode_Estimateshipping;
	public static void checkoutOption()
	{
		Elements.click(ShoppingCartPage.checkout);
	}
}
