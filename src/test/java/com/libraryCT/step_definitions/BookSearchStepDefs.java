package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.StudentBooksPage;
import com.libraryCT.pages.Student_BasePage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;

public class BookSearchStepDefs {

     LoginPage loginPage=new LoginPage();
     StudentBooksPage studentBooksPage=new StudentBooksPage();
     Select select;


    @Given("user is login as student")
    public void userIsLoginWith() {
       // username = ConfigurationReader.getProperty("student14username");
        //password = ConfigurationReader.getProperty("student14password");
       // loginPage.login(username,password);
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
       // BrowserUtils.sleep();
        loginPage.loginAs("student");
    }

    @And("user clicks on Books link")
    public void userClicksOnBooksLink() {
        BrowserUtils.sleep(2);
        studentBooksPage.booksLink.click();
    }

    @When("User clicks Book Categories  Dropdown")
    public void userClicksBookCategoriesDropdown() {
        BrowserUtils.sleep(2);
        select=new Select(studentBooksPage.bookCategoriesDropdown);
        studentBooksPage.bookCategoriesDropdown.click();
    }



    @Then("User should see below info in Book Categories dropdown")
    public void userShouldSeeBelowInfoInBookCategoriesDropdown(List<String> options) {
    select=new Select(studentBooksPage.bookCategoriesDropdown);
    List<WebElement>webElements=select.getOptions();
    List<String>actualTexts= getElementsText(webElements);
      Assert.assertEquals(options,actualTexts);
    }



    public static List<String> getElementsText(List<WebElement>list){
        List<String>elemTexts=new ArrayList<>();
        for(WebElement el:list){
            elemTexts.add(el.getText()) ;
        }
        return elemTexts;
    }


    @When("User selects  a book from book category options")
    public void userClicksABookCategoryOption() {
        BrowserUtils.sleep(2);
        select=new Select(studentBooksPage.bookCategoriesDropdown);
        select.selectByIndex(1);


    }

    @Then("User should see books from that category")
    public void userShouldSeeBooksFromThatCategory() {
        BrowserUtils.sleep(2);
        String expected=select.getFirstSelectedOption().getText();
        System.out.println(expected);

        String actual=studentBooksPage.category.getText();
        //select.selectByVisibleText("Action and Adventure");

        // System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
    }
}
