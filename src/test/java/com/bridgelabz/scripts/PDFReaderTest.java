
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for PDF File reader.
 *  @since   19-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;

import com.bridgelabz.DataDriven.PDFReader;
import com.bridgelabz.base.BaseClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class PDFReaderTest extends BaseClass
{
    @Test
    public void test() throws IOException, InterruptedException
    {
        PDFReader pdfReader=new PDFReader(driver);
        pdfReader.verifyPDFContent();
        Thread.sleep(3000);
        System.out.println("Pdf Opened Successfully");
    }
}



