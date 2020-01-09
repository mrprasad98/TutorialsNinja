package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Search {
HeadersSection headersection=new HeadersSection();
SearchResultPage searchresultpage=new SearchResultPage();

	@When("^I search for product \"([^\"]*)\"$")
	public void i_search_for_product(String message)  {
	   Elements.TypeText(HeadersSection.SearchBoxField, message);
	   Elements.click(HeadersSection.SearchButton);
	   
	}

	@Then("^I should see the product in searchresult page$")
	public void i_should_see_the_product_in_searchresult_page() {
	    
	    Assert.assertTrue(Elements.isDisplayed(SearchResultPage.samsungSynMaster));
	}
	
	@Then("^I should see the message as \"([^\"]*)\"$")
	public void i_should_see_the_message_as(String message) {
	    Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.searchNotFound, "Your shopping cart is empty!"));
	    
	}
}
