package com.libraryCT.step_definitions;
import com.libraryCT.pages.Librarian_BasePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.LibrarianUsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import com.libraryCT.utilities.GlobalDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class Add_User_step_definition extends Librarian_BasePage {
    LibrarianUsersPage librarianUsersPage = new LibrarianUsersPage();
    GlobalDataUtil globalDataUtil = new GlobalDataUtil();

    @Given("User login as an librarian and user is on the Library home page")
    public void givenUserLoginAsAnLibrarianAndUserIsOnTheLibraryHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("librarian");
        loginPage.signInButton.click();
    }

    @When("User clicks on Users tab")
    public void user_clicks_on_users_tab() {
        borrowingBooksLink.click();
    }

    @When("User clicks on Add User tab")
    public void user_clicks_on_add_user_tab() {
        librarianUsersPage.addUserButton.click();
    }

    @When("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {
    }

    @And("User enters {string} to Full name input box")
    public void userEntersToFullNameInputBox(String fullName) {
         fullName = BrowserUtils.generatesRandomName();
         globalDataUtil.setFullName(fullName);
         librarianUsersPage.inputBoxes("full_name").sendKeys(fullName);

    }

    @And("User enters {string} to Password input box")
    public void userEntersToPasswordInputBox(String password) {
         password = BrowserUtils.generatesRandomPassword();
        librarianUsersPage.inputBoxes("password").sendKeys(password);
    }

    @And("User enters {string} to Email input box")
    public void userEntersToEmailInputBox(String Email) {
         Email = BrowserUtils.generatesRandomEmail();
        librarianUsersPage.inputBoxes("email").sendKeys(Email);
    }

    @And("User selects {string} from User group drop down")
    public void userSelectsFromUserGroupDropDown(String option) {
        Select UserGroup = new Select(librarianUsersPage.inputBoxes2("user_group_id"));
        option = "Librarian";
        UserGroup.selectByVisibleText(option);
    }

    @And("User selects {string} from Status drop down")
    public void userSelectsFromStatusDropDown(String option) {
        Select Status = new Select(librarianUsersPage.inputBoxes2("status"));
        option = "ACTIVE";
        Status.selectByVisibleText(option);
    }

    @And("User enters {string} to Start Date input box")
    public void userEntersToStartDateInputBox(String startDate) {
        librarianUsersPage.inputBoxes("start_date").clear();
        startDate = "2020-10-21";
        librarianUsersPage.inputBoxes("start_date").sendKeys(startDate+Keys.ENTER);
    }

    @And("User enters {string} to End Date input box")
    public void userEntersToEndDateInputBox(String endDate) {
        librarianUsersPage.inputBoxes("end_date").clear();
        endDate = "2021-10-21";
        librarianUsersPage.inputBoxes("end_date").sendKeys("2021-10-21"+Keys.ENTER);
    }

    @And("User enters {string} to Address input box")
    public void userEntersToAddressInputBox(String Address) {
         Address = BrowserUtils.generatesRandomAddress();
        librarianUsersPage.addressInputBox.sendKeys(Address);

    }

    @And("User clicks on Save change button")
    public void userClicksOnSaveChangeButton() {
        librarianUsersPage.saveChangeButton.click();
        BrowserUtils.sleep(5);
    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String FullName) {
        BrowserUtils.waitUntilTextToBePresent(librarianUsersPage.newlyAddedUsersName, librarianUsersPage.newlyAddedUsersName.getText());
        String actualName = librarianUsersPage.newlyAddedUsersName.getText();
        Assert.assertEquals(actualName,globalDataUtil.getFullName());
    }


    @Given("User login as an librarian to the Library home page")
    public void userLoginAsAnLibrarianToTheLibraryHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("librarian");
        loginPage.signInButton.click();
    }

    @When("User clicks on Users link")
    public void userClicksOnUsersLink() {
        borrowingBooksLink.click();
    }

    @And("User clicks on Add User button")
    public void userClicksOnAddUserButton() {
        librarianUsersPage.addUserButton.click();
    }

    @And("User clicks on Close button tab")
    public void userClicksOnCloseButtonTab() {
        BrowserUtils.waitUntilClickable(librarianUsersPage.closeButton);
        librarianUsersPage.closeButton.click();
    }

    @Then("Add User pop up should be closed")
    public void addUserPopUpShouldBeClosed() {
        Assert.assertEquals("modal fade", librarianUsersPage.getAttributeValue());

    }


    @Given("User login to the home page as a Librarian")
    public void userLoginToTheHomePageAsALibrarian() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("librarian");
        loginPage.signInButton.click();
    }

    @When("User clicks on User option on home page")
    public void userClicksOnUserOptionOnHomePage() {
        borrowingBooksLink.click();
    }

    @And("User clicks on Edit User button")
    public void userClicksOnEditUserButton() {
        librarianUsersPage.editUserButton.click();

    }

    @And("User change the {string} in Edit User Info pop up")
    public void userChangeTheInEditUserInfoPopUp(String fullName) {

        fullName = BrowserUtils.generatesRandomName();
        librarianUsersPage.inputBoxes("full_name").clear();
        librarianUsersPage.inputBoxes("full_name").sendKeys(fullName);
        globalDataUtil.setFullName(fullName);
}

    @And("User clicks on Save change")
    public void userClicksOnSaveChange() {
        BrowserUtils.waitUntilClickable(librarianUsersPage.saveChangeButton);
        librarianUsersPage.saveChangeButton.click();
        BrowserUtils.sleep(5);
    }

    @Then("User verify the changed name is in the list")
    public void userVerifyTheChangedNameIsInTheList() {
        BrowserUtils.waitUntilTextToBePresent(librarianUsersPage.newlyAddedUsersName, librarianUsersPage.newlyAddedUsersName.getText());
        String expected = globalDataUtil.getFullName();
        String actualName = librarianUsersPage.newlyAddedUsersName.getText();
        Assert.assertEquals(actualName,expected);

    }
}



