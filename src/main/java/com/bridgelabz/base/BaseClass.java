
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Load driver for executes Tests.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.base;

import com.bridgelabz.constants.ConstantPaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseClass implements ConstantPaths
{
    public static WebDriver driver = null;
    ChromeOptions options = new ChromeOptions();

    // for launching the browser

    @BeforeMethod(description = "load driver for test")
    public void setUp(String browserName)
    {
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver(options);

        //Maximizes the browser window
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //Close Driver
    @AfterMethod(description = "close driver after test")
    public void tearDown()
        {
            driver.close();
        }
}
