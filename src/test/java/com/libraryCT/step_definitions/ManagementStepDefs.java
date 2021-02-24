package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.Management_Page;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
      @Then("the user should see the following column names:")
      public void the_user_should_see_the_following_column_names(List<String>columnNames) {
          
          System.out.println("columnNames = " + columnNames);
          for (String eachName : columnNames) {
              System.out.println("eachName = " + eachName); 
          }
          //done

}
}
