package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Management_Page {



    public Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public  WebElement userModule;

    @FindBy(xpath = "//th[@aria-label='Actions']")
    public WebElement actionColumn;

    @FindBy(xpath = "//th[@data-name='id']")
    public WebElement UserIDColumn;

    @FindBy(xpath = "//th[@data-name='email']")
    public WebElement emailColumn;

    @FindBy(xpath = "//th[@data-name='group_name']")
    public WebElement groupColumn;

    @FindBy(xpath = "//th[@data-name='status']")
    public WebElement statusColumn;

}
