package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.StudentBooksPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @When("the user login with {string} {string}")
    public void the_user_login_with(String username, String password) {
        new LoginPage().login(username,password);
    }

    @When("the user login as a {string}")
    public void the_user_login_as_a(String userType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        new LoginPage().loginAs(userType);
    }

    @Then("the user is on {string} page")
    public void the_user_is_on_page(String expectedPage) {
        BrowserUtils.waitUntilURLContains(expectedPage);
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedPage));
    }

    @Then("the user see user name {string}")
    public void the_user_see_user_name(String expectedName) {
        BrowserUtils.waitUntilURLContains("#");
        String actualName = new StudentBooksPage().getUserName();
        Assert.assertEquals(expectedName,actualName);
    }

    @Then("the user should see error message")
    public void the_user_should_see_error_message() {
        LoginPage loginPage = new LoginPage();
        boolean errorMessageDisplayed = BrowserUtils.waitUntilTextToBePresent(loginPage.errorMessage," ");
        Assert.assertTrue(errorMessageDisplayed);
    }
}
