
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Upload file.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.model.UploadPage;
import org.testng.annotations.Test;

public class UploadPageTest extends BaseClass
{
    @Test
    public void loginPageTest() throws InterruptedException
    {
        UploadPage uploadPage=new UploadPage(driver);

        uploadPage.clickOnSelectFileButton();
        Thread.sleep(1000);
        System.out.println("File Uploaded Successfully");
    }
}
