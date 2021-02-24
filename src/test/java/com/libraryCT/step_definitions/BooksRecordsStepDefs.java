package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibrarianBooksPage;
import com.libraryCT.pages.Librarian_BasePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;


public class BooksRecordsStepDefs {

    @Given("the user click on books module")
    public void the_user_click_on_books_module() {
        new LibrarianBooksPage().booksLink.click();
    }

    @Then("the user should see default book record is {int}")
    public void theUserShouldSeeDefaultBookRecordIs(int defaultRecord) {
        LibrarianBooksPage librarianBooksPage = new LibrarianBooksPage();
        Assert.assertEquals(defaultRecord,librarianBooksPage.getDefaultNumber());
    }

    @When("the user click on record number option")
    public void the_user_click_on_record_number_option() {
        LibrarianBooksPage librarianBooksPage = new LibrarianBooksPage();
        librarianBooksPage.booksRecordsDropdown.click();

    }



    @Then("the user should see following record options")
    public void the_user_should_see_following_record_options(List<String> recordOptions) {
        LibrarianBooksPage librarianBooksPage = new LibrarianBooksPage();
        Assert.assertEquals(recordOptions,librarianBooksPage.getRecordOptions());
    }
}
