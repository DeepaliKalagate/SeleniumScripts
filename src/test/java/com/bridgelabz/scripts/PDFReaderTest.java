package com.bridgelabz.scripts;

import com.bridgelabz.DataDriven.PDFReader;
import com.bridgelabz.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PDFReaderTest extends BaseClass
{
    @Test
    public void test() throws IOException
    {
        PDFReader pdfReader=new PDFReader(driver);
        pdfReader.verifyPDFContent();
    }
}



