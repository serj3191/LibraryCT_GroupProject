package com.libraryCT.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}

    private static ThreadLocal<WebDriver> driverpool = new ThreadLocal<>();

    public static WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        if (driverpool.get() == null) {

            synchronized (Driver.class) {

                String browser = ConfigurationReader.getProperty("browser");

                switch (browser.toLowerCase()) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                        driverpool.set(new ChromeDriver(options));
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverpool.set(new FirefoxDriver());
                        break;
                    default:
                        WebDriverManager.chromedriver().setup();
                        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                        driverpool.set(new ChromeDriver(options));
                        break;
                    case "chrome_headless":
                        WebDriverManager.chromedriver().setup();
                        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                        options.setHeadless(true);
                        driverpool.set(new ChromeDriver(options));
                }

                driverpool.get().manage().window().maximize();
                driverpool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        }
        return driverpool.get();
    }

    public static void closeDriver(){
        if (driverpool.get() != null){
            driverpool.get().quit();
            driverpool.remove();
        }
    }

}
