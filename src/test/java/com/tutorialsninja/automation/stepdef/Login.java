package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
HeadersSection headerssection=new HeadersSection();
LoginPage loginpage=new LoginPage();
MyAccountPage myaccountpage=new MyAccountPage();
ForgottenPasswordPage forgottenpassword=new ForgottenPasswordPage();
	@And("^I navigate to Account login page$")
	public void i_navigate_to_Account_login_page() {
	    Elements.click(HeadersSection.MyAccount);
		Elements.click(HeadersSection.LoginButton);
	    
	}

	@When("^I login into the application using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_into_the_application_using_username_and_password(String email, String password)  {
	    Elements.TypeText(LoginPage.EmailField, email);
	    Elements.TypeText(LoginPage.PasswordField, password);
	    Elements.click(LoginPage.LoginButton);
	}

	@Then("^I should see that the user able to login successfully$")
	public void i_should_see_that_the_user_able_to_login_successfully() {
	    Assert.assertTrue(Elements.isDisplayed(MyAccountPage.Registerforanaffiliateaccount));
	}
	
	@Then("^I should see an error message that the credentials are invalid$")
	public void i_should_see_an_error_message_that_the_credentials_are_invalid() {
	    Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning, "Warning: No match for E-Mail Address and/or Password."));
	    
	}
	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email)  {
	    Elements.click(LoginPage.ForgottenPassword);
	    Elements.TypeText(ForgottenPasswordPage.EmailAddress, email);
	    Elements.click(ForgottenPasswordPage.continuebutton);
	}

	@Then("^I should the message informing the user that information related to resetting password have been sent to email address$")
	public void i_should_the_message_informing_the_user_that_information_related_to_resetting_password_have_been_sent_to_email_address()  {
	   
	   Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning, "An email with a confirmation link has been sent your email address."));
	}



}
