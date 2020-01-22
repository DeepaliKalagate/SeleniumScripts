package com.bridgelabz.scripts;

import com.bridgelabz.DataDriven.WindowHandler;
import com.bridgelabz.base.BaseClass;
import org.testng.annotations.Test;

public class WindowHandlerTest extends BaseClass
{
    @Test
    public void testMultipleWindows() throws InterruptedException
    {
        WindowHandler windowHandler=new WindowHandler();
        driver.get("http://demo.guru99.com/popup.php");
        windowHandler.handleWindow();
    }
}

