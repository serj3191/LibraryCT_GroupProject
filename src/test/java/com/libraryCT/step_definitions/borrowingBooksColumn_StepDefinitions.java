package com.libraryCT.step_definitions;

import com.libraryCT.pages.BorrowingBooksPage;
import com.libraryCT.pages.Librarian_BasePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtil;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class borrowingBooksColumn_StepDefinitions {
LoginPage loginPage = new LoginPage();
Librarian_BasePage librarian_basePage = new Librarian_BasePage();
BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();

    @Given("the user on the homepage as a student")
    public void the_user_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    loginPage.loginAs("student");

    }



    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {
        BrowserUtils.sleep(2);

    borrowingBooksPage.borrowingBooksButton.click();
    }


    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedColumnNames) {


        List<String> actualColumnNames = BrowserUtil.getElementsText(borrowingBooksPage.tableHeaders);
        Assert.assertEquals(actualColumnNames, expectedColumnNames);

        }



}

