package com.zensar.cucumber.selpdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ServiceSteps {
    @Given("^User is on home page$")
    public void userIsOnHomePage() {
    }

    @And("^User clicks on the log in link$")
    public void userClicksOnTheLogInLink() {
    }

    @Then("^User should navigate to relative page$")
    public void userShouldNavigateToRelativePage() {
    }

    @And("^User should navigate to login page as should see \"([^\"]*)\" message$")
    public void userShouldNavigateToLoginPageAsShouldSeeMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
