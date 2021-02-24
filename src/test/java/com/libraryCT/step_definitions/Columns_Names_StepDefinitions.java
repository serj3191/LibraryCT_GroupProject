package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.StudentBooksPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Columns_Names_StepDefinitions {

    @Given("the user is on homepage")
    public void theUserIsOnHomepage(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        new LoginPage().login(username,password);
    }

    @Then("the user should see the following Column names:")
    public void theUserShouldSeeTheFollowingColumnNames(List<String>data) {
        StudentBooksPage page = new StudentBooksPage();
        List <String> actual = page.tableheaders.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        Assert.assertEquals(actual,data);
    }
}
