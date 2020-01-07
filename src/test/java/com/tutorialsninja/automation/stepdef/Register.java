package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegistrationPage;
import com.tutorialsninja.automation.pages.RegistrationSuccessPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	HeadersSection headersection = new HeadersSection();
	RegistrationPage registrationpage = new RegistrationPage();
	RegistrationSuccessPage success = new RegistrationSuccessPage();

	@Given("^I launch the browser$")
	public void i_launch_the_browser() {
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Registration Page$")
	public void i_navigate_to_Registration_Page() {
		Elements.click(HeadersSection.MyAccount);
		Elements.click(HeadersSection.Register);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable datatable) {

		RegistrationPage.enterRegistrationDetails(datatable);
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
		Elements.click(RegistrationPage.PrivacyPolicy);
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button() {
		Elements.click(RegistrationPage.Continue);
	}

	@Then("^I should see that user account created successfully$")
	public void i_should_see_that_user_account_created_successfully() {
		Assert.assertTrue(Elements.isDisplayed(RegistrationSuccessPage.Success));

	}

}
