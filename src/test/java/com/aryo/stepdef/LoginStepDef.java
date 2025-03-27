package com.aryo.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user input username text box with {string}")
    public void userInputUsernameTextBoxWith(String arg0) {
    }

    @And("user input password pada text box with {string}")
    public void userInputPasswordPadaTextBoxWith(String arg0) {
    }

    @And("user click login button")
    public void userClickLoginButton() {
    }

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
    }

    @Then("A message appears {string}")
    public void aMessageAppears(String arg0) {
    }
}
