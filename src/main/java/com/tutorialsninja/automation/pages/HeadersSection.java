package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {

	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(xpath = "//a[text()='My Account']")
	public static WebElement MyAccount;

	@FindBy(linkText = "Register")
	public static WebElement Register;
	
	@FindBy(linkText="Login")
	public static WebElement LoginButton;

	@FindBy(xpath="//div[@id='search']/input")
	public static WebElement SearchBoxField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement SearchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement shoppingCart;
	
	public static void navigateToLoginPage()
	{
		Elements.click(MyAccount);
		Elements.click(LoginButton);

	}
	public static void searchProduct()
	{
		Elements.TypeText(SearchBoxField, Base.reader.getProduct());
		Elements.click(SearchButton);

	}
	public static void shoppingCartOption()
	{
		Elements.click(shoppingCart);
	}
}
