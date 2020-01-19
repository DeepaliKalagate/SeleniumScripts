
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage extends BaseClass
{
    @FindBy(xpath = "//input[@id='imagesrc']")
    private WebElement clickOnUpload;

    //constructor
    public UploadPage(WebDriver driver)
    {
        //Initialization
        PageFactory.initElements(driver, this);
    }

    //Utilization
    public void clickOnSelectFileButton()
    {
        clickOnUpload.sendKeys("/home/admin123/Desktop/xyz.txt");
    }



}
