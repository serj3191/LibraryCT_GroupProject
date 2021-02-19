package com.libraryCT.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void sleep(double second){
        try { Thread.sleep((long)(1000*second)); }
        catch (InterruptedException e) { System.out.println("Something happende in sleep method"); }
    }

    public static WebElement waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilURLContains(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains(title));
    }

    public static boolean waitUntilTextToBePresent(WebElement element,String text) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }

}
