package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.Management_Page;
import com.libraryCT.pages.StudentBooksPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ManagementStepDefs {
    LoginPage loginPage = new LoginPage();
    Management_Page management_page = new Management_Page();

    @Given("the user\\(librarian) on the homepage")
    public void the_user_librarian_on_the_homepage() {
        String url = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);
        loginPage.emailInput.sendKeys("librarian12@library");
        loginPage.passwordInput.sendKeys("GBjogjFV");
        loginPage.signInButton.click();
        BrowserUtils.sleep(3);

    }

    @When("the user click users module")
    public void the_user_click_users_module() {
        management_page.userModule.click();
    }


}
