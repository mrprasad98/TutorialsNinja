package com.tutorialsninja.automation.pages;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class CheckOutPage {

	public CheckOutPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//input[@type='radio'][@name='account'][@value='guest']")
	public static WebElement guest_Account;
	@FindBy(css=".accordion-toggle")
	public static WebElement newAddress;
	@FindBy(xpath="//input[@name='firstname']")
	public static WebElement first_name_BillingDetails;
	
	@FindBy(id="input-payment-lastname")
	public static WebElement last_name_BillingDetails;
	
	@FindBy(id="input-payment-company")
	public static WebElement company_BillingDetails;
	
	@FindBy(id="input-payment-address-1")
	public static WebElement Address1_BillingDetails;
	
	@FindBy(id="input-payment-address-2")
	public static WebElement Address2_BillingDetails;
	
	@FindBy(id="input-payment-city")
	public static WebElement City_BillingDetails;
	
	@FindBy(id="input-payment-postcode")
	public static WebElement PostCode_BillingDetails;
	
	@FindBy(id="input-payment-country")
	public static WebElement County_BillingDetails_Dropdown;
	
	@FindBy(id="input-payment-zone")
	public static WebElement State_BillingDetails_Dropdown;
	
	@FindBy(id="button-payment-address")
	public static WebElement Continue_BillingDetails;
	
	@FindBy(id="button-account")
	public static WebElement continueButton;
	
	@FindBy(id="button-register")
	public static WebElement ContinueButtonBilling;
	
	public static void guestContinueOption()
	{
		Elements.click(continueButton);
	}
	public static void guestAccountOption()
	{
		Elements.click(CheckOutPage.guest_Account);
	}
	public static void enterBillingDetails(DataTable dataTable_Billing, String detailsType) 
	{
				Map<String, String> billingdata=dataTable_Billing.asMap(String.class, String.class);
				Elements.TypeText(CheckOutPage.first_name_BillingDetails, billingdata.get("FirstName"));
		Elements.TypeText(CheckOutPage.last_name_BillingDetails, billingdata.get("LastName"));
		Elements.TypeText(CheckOutPage.company_BillingDetails, billingdata.get("Company"));
		Elements.TypeText(CheckOutPage.Address1_BillingDetails, billingdata.get("Address1"));
		Elements.TypeText(CheckOutPage.Address2_BillingDetails, billingdata.get("Address2"));
		Elements.TypeText(CheckOutPage.City_BillingDetails, billingdata.get("City"));
		Elements.TypeText(CheckOutPage.Address1_BillingDetails, billingdata.get("Address1"));
		Elements.TypeText(CheckOutPage.PostCode_BillingDetails, billingdata.get("PostCode"));
		
	}
	}

