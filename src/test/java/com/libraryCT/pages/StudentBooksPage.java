package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentBooksPage extends Student_BasePage{

    public String getUserName() {
        return navBarDropdown.getText().trim();
    }

    @FindBy(id = "book_categories")
    public WebElement bookCategoriesDropdown;


    @FindBy(xpath = "//th[@aria-label='Category: activate to sort column descending']")
    public WebElement categoryButton;

    @FindBy(xpath="//*[@id='tbl_books']/tbody/tr[1]/td[5]")
    public WebElement category;

}
