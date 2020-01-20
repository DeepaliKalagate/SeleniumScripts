package com.bridgelabz.DataDriven;

import com.bridgelabz.base.BaseClass;

import java.util.Iterator;
import java.util.Set;

public class WindowHandler extends BaseClass
{
    public void handleWindow() throws InterruptedException
    {
        // It will return the parent window name as a String
        String mainWindow=driver.getWindowHandle();
        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> set =driver.getWindowHandles();
        // Using Iterator to iterate with in windows
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            String childWindow=itr.next();
            // Compare whether the main windows is not equal to child window. If not equal, we will close.
            if(!mainWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
                Thread.sleep(1000);
                System.out.println(driver.switchTo().window(childWindow).getTitle());
                driver.close();
            }
        }
        // This is to switch to the main window
        driver.switchTo().window(mainWindow);
    }
}
