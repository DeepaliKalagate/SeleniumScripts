
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
import com.bridgelabz.properties.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass implements ConstantPaths
{
    public static WebDriver driver = null;
    ChromeOptions options = new ChromeOptions();

    // for launching the browser

    @BeforeMethod(description = "load driver for test")
    public void setUp()
    {
        options.addArguments("--disable-notifications");
        System.setProperty(CHROMEKEY, CHROMEVALUE);
        driver = new ChromeDriver(options);
        String url = Library.getProperty(CONFIGPATH, "URL");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }

        @AfterMethod(description = "close driver after test")
        public void tearDown()
        {
            driver.close();
        }
}
