package com.libraryCT.pages;

public class StudentBooksPage extends Student_BasePage{

    public String getUserName() {
        return navBarDropdown.getText().trim();
    }

}
