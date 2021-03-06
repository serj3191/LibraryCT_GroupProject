package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class Librarian_BasePage {
    public Librarian_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(@href,'dashboard')]")
    public WebElement dashboardLink;

    @FindBy(xpath = "//a[contains(@href,'users')]")
    public WebElement borrowingBooksLink;

    @FindBy(xpath = "//a[contains(@href,'books')]")
    public WebElement booksLink;

    @FindBy(id = "navbarDropdown")
    public WebElement navBarDropdown;

    @FindBy(xpath = "//ul[@id='menu_item']/li")
    public List<WebElement> menuLinks;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement Logout;
}
