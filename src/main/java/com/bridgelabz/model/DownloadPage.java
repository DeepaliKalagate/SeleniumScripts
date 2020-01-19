
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Web Elements for download file.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage
{


    @FindBy(xpath = "//a[@class='nav-link btn btn-primary']")
    private WebElement clickOnDownload;

    @FindBy(xpath = "//a[contains(text(),'Zip')]")
    private WebElement clickOnSelectFile;

    //constructor
    public DownloadPage(WebDriver driver)
    {
        //Initialization
        PageFactory.initElements(driver, this);
    }

    //Utilization
    public void clickOnDownloadButton()
    {
        clickOnDownload.click();
    }

    public void clickOnSelectFileButton()
    {
        clickOnSelectFile.click();
    }
}
