package com.libraryCT.step_definitions;

import com.libraryCT.pages.LogoutPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LogoutsStepDefs {

    LogoutPage logoutPage=new LogoutPage();

    @When("the user clicks the dropdown button")
    public void the_user_clicks_the_dropdown_button() {

        BrowserUtils.sleep(3);
        logoutPage.dropdown.click();

    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
    logoutPage.Logout.click();
        BrowserUtils.sleep(3);
    }

    @Then("the user sees the loginPage")
    public void the_user_sees_the_login_page() {
        String expectedTitle="Login - Library";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
