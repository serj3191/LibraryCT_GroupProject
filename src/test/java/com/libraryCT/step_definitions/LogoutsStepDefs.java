package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibrarianDashboardPage;
import com.libraryCT.pages.StudentBooksPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutsStepDefs  {


    @Then("the user sees the loginPage")
    public void the_user_sees_the_login_page() {
        String expectedTitle="Login - Library";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @And("the student clicks the dropdown button")
    public void theStudentClicksTheDropdownButton() {
        StudentBooksPage studentBooksPage = new StudentBooksPage();
        BrowserUtils.sleep(3);
        studentBooksPage.navBarDropdown.click();
    }

    @And("the student clicks the logout button")
    public void theStudentClicksTheLogoutButton() {
        StudentBooksPage studentBooksPage = new StudentBooksPage();
            studentBooksPage.Logout.click();
            BrowserUtils.sleep(3);
    }

    @And("the librarian clicks the dropdown button")
    public void theLibrarianClicksTheDropdownButton() {
        LibrarianDashboardPage librarianDashboardPage = new LibrarianDashboardPage();
        BrowserUtils.sleep(3);
       librarianDashboardPage.navBarDropdown.click();
        }


    @And("the librarian clicks the logout button")
    public void theLibrarianClicksTheLogoutButton() {
        LibrarianDashboardPage librarianDashboardPage = new LibrarianDashboardPage();
        librarianDashboardPage.Logout.click();
    }
}
