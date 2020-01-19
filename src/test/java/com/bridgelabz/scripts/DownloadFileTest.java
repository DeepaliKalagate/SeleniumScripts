
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Download File.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;
import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.DownloadPage;
import org.testng.annotations.Test;

public class DownloadFileTest extends BaseClass
{
    @Test
    public void downloadFileTest() throws InterruptedException
    {
        DownloadPage downloadPage=new DownloadPage(driver);

        downloadPage.clickOnDownloadButton();
        Thread.sleep(500);
        downloadPage.clickOnSelectFileButton();
        System.out.println("File Downloading...Please Wait for some time......");
        Thread.sleep(500);

        System.out.println("File Downloaded Successfully");
    }
}
