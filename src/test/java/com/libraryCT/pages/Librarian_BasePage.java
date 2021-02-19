package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class Librarian_BasePage {
    public Librarian_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
