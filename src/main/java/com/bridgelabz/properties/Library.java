
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Set Properties for Execute test.
 *  @since   19-01-2020
 *
 ******************************************************************************/


package com.bridgelabz.properties;

import com.bridgelabz.base.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

public class Library extends BaseClass
{
    public static String getProperty(String CONFIG_PATH, String key)
    {
        String property = "";
        Properties prop = new Properties();

        try
        {
            prop.load(new FileInputStream(CONFIG_PATH));
            property = prop.getProperty(key);
        }
        catch(Exception e)
        {e.printStackTrace();}

        return property;
    }

}
