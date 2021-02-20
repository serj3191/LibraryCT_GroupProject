package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StudentBooksPage extends Student_BasePage{

    public String getUserName() {
        return navBarDropdown.getText().trim();
    }

    @FindBy(xpath = "//table[@id='tbl_books']//th")
    public List<WebElement> tableheaders;

}
