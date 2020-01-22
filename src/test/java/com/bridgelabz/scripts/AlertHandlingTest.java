package com.bridgelabz.scripts;

import com.bridgelabz.DataDriven.AlertHandler;
import com.bridgelabz.base.BaseClass;
import org.testng.annotations.Test;

public class AlertHandlingTest extends BaseClass
{
    @Test
    public void testAlert() throws InterruptedException
    {
        AlertHandler alertHandler=new AlertHandler(driver);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(1000);
        alertHandler.click();
        Thread.sleep(1000);
        alertHandler.alert();
        Thread.sleep(1000);
        alertHandler.email();
        alertHandler.password();
        alertHandler.clickAgain();
    }

}
