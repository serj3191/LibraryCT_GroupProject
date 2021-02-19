package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[contains(@class,'alert-danger')]")
    public WebElement errorMessage;

    public void loginAs(String userType) {
        String username;
        String password;
        if (userType.equalsIgnoreCase("student")) {
            username = ConfigurationReader.getProperty("student14username");
            password = ConfigurationReader.getProperty("student14password");
            login(username,password);
        } else if (userType.equalsIgnoreCase("librarian")) {
            username = ConfigurationReader.getProperty("librarian12username");
            password = ConfigurationReader.getProperty("librarian12password");
            login(username,password);
        } else {
            throw new RuntimeException("Invalid User Type!");
        }
    }

    public void login(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        BrowserUtils.waitUntilClickable(signInButton).click();
    }

    public String getErrorMessage() {
        return errorMessage.getText().trim();
    }
}
