
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Web Elements for Upload File on given URL.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.model;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class UploadPage extends BaseClass
{
    @FindBy(xpath = "//input[@id='uploadfile_0']")
    private WebElement clickOnUpload;

    //constructor
    public UploadPage(WebDriver driver)
    {
        //Initialization
        PageFactory.initElements(driver, this);
    }

    public void clickOnUpload()
    {
        clickOnUpload.click();
    }
}
