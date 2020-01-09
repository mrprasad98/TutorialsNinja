package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class LoginPage {

	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-email")
	public static WebElement EmailField;
	@FindBy(id="input-password")
	public static WebElement PasswordField;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public static WebElement LoginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement ForgottenPassword;
	
	public static void doLogin()
	{
		Elements.TypeText(EmailField, Base.reader.getUsername());
		Elements.TypeText(PasswordField, Base.reader.getPassword());
		Waits.waitUntilElementToClick(10, LoginButton);
		Elements.click(LoginButton);
	}
	
}
