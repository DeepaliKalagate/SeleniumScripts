
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Popup Window Handler.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;
import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class PopUpWindowHandlerTest extends BaseClass
{
    @Test
    public void test()
    {
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}

