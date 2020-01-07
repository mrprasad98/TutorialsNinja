package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegistrationPage {

	public RegistrationPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-firstname")
	public static WebElement FistName;
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	@FindBy(id="input-email")
	public static WebElement Email;
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	@FindBy(id="input-password")
	public static WebElement Password;
	@FindBy(id="input-confirm")
	public static WebElement PasswordConfirm;
	@FindBy(xpath="//input[@name='agree']")
	public static WebElement PrivacyPolicy;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public static WebElement Continue;
	public static void enterRegistrationDetails(DataTable datatable)
	{
		Map<String, String> map=datatable.asMap(String.class, String.class);
		Elements.TypeText(RegistrationPage.FistName, map.get("firstname"));
		Elements.TypeText(RegistrationPage.LastName, map.get("lastname"));
		Elements.TypeText(RegistrationPage.Email, map.get("email"));
		Elements.TypeText(RegistrationPage.Telephone, map.get("telephone"));
		Elements.TypeText(RegistrationPage.Password, map.get("password"));
		Elements.TypeText(RegistrationPage.PasswordConfirm, map.get("password"));
		
	}
	
	
	
	
}
