package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class Student_BasePage {

    public Student_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
