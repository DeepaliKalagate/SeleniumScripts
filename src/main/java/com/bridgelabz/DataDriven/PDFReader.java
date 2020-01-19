package com.bridgelabz.DataDriven;

import com.bridgelabz.base.BaseClass;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PDFReader extends BaseClass
{
    public PDFReader(WebDriver driver)
    {
        super();
    }

    public String verifyPDFContent() throws IOException
    {

        URL url = new URL(driver.getCurrentUrl());
        InputStream is = url.openStream();
        BufferedInputStream fileToParse = new BufferedInputStream(is);
        PDDocument document = null;
        String output=null;
        try
        {
            document = PDDocument.load(fileToParse);
            output = new PDFTextStripper().getText(document);
        }
        finally
        {
            if (document != null)
            {
                document.close();
            }
            fileToParse.close();
            is.close();
        }
        return output;
    }
}
