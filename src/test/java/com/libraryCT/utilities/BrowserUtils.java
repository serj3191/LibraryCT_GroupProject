package com.libraryCT.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class BrowserUtils {
    static Faker faker = new Faker();
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

    public static String generatesRandomName(){
        return faker.name().fullName();
    }

    public static String generatesRandomPassword(){
        return faker.name()+""+faker.number();
    }

    public static String generatesRandomEmail(){
        return faker.internet().emailAddress();
    }

    public static String generatesRandomAddress(){
        return faker.address().fullAddress();
    }

    /**
     * This method generates a number within the bound
     * @param | int bound
     * @return any number within the bound that is entered by user
     */
    public static int generatesRandomNum(int min, int max){
        Faker faker = new Faker();
       return faker.number().numberBetween(min,max);
    }
}
