package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement dropdown;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement Logout;


}
