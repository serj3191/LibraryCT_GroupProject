package com.libraryCT.pages;


import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BorrowingBooksPage extends Librarian_BasePage {
    public BorrowingBooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(@class, 'title') and text()='Borrowing Books']")
    public WebElement borrowingBooksButton;

    @FindBy(xpath = "//th")
    public List<WebElement> tableHeaders;
}



//import com.libraryCT.utilities.Driver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.List;
//
//public class BorrowingBooksPage {
//
//    public BorrowingBooksPage(){
//        PageFactory.initElements(Driver.getDriver(), this);
//
////        @FindBy(xpath = "//span[contains(@class, 'title') and text()='Borrowing Books']")
////        public WebElement borrowingBooksButton;
////
//       @FindBy(xpath = "//th")
//        public List<WebElement> tableHeader;
//    }
//}
