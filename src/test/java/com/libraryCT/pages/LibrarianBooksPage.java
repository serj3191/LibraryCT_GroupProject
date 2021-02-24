package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class LibrarianBooksPage extends Librarian_BasePage {

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement booksRecordsDropdown;

    public int getDefaultNumber(){

        Select select = new Select(booksRecordsDropdown);
      return  Integer.parseInt(select.getFirstSelectedOption().getText());

    }

    public List<String> getRecordOptions(){
        Select select = new Select(booksRecordsDropdown);
        List<String> options= new ArrayList<>();
        for (WebElement option : select.getOptions()) {
            options.add(option.getText());
        }
        return options;
    }


}
