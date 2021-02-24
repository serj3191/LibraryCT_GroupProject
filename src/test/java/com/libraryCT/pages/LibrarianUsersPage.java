package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LibrarianUsersPage {

    public LibrarianUsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUserButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangeButton;

    @FindBy(id = "address")
    public WebElement addressInputBox;

    @FindBy(xpath = "//tr[1]//td[3]")
    public WebElement newlyAddedUsersName;

    @FindBy(xpath = "//button[.='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "/html/body/main/section[2]/div[2]")
    public WebElement AddUserPopUp;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    public WebElement editUserButton;


    /**
     * This method locates webElements on Add User pop up
     *
     * @param |full_name | password | email | start_date | end_date
     * @return WebElements in Add User pop up (except drop downs)
     */
    public WebElement inputBoxes(String inputBoxName) {
        String str = String.format("//input[@name='%s']", inputBoxName);
        return Driver.getDriver().findElement(By.xpath(str));
    }

    /**
     * This method locates drop down webElement on Add User pop ip
     *
     * @param |user_group_id | status
     * @return drop down WebElements
     */
    public WebElement inputBoxes2(String inputBoxName) {
        String str = String.format("//select[@name='%s']", inputBoxName);
        return Driver.getDriver().findElement(By.xpath(str));
    }

    /**
     * This method get the Attribute value of "class" attribute of the given webElement
     *
     * @return | The attribute value of "class" attribute
     */
    public String getAttributeValue() {
        return AddUserPopUp.getAttribute("class");
    }
}