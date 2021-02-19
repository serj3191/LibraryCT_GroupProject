package com.libraryCT.utilities;

public class BrowserUtils {
    public static void sleep(double second){
        try { Thread.sleep((long)(1000*second)); }
        catch (InterruptedException e) { System.out.println("Something happende in sleep method"); }
    }

}
