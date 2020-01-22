
/******************************************************************************
 *
 *  Author  Deepali Kalagate
 *
 *  Purpose: Test for Drag and Drop elements using Actions Class.
 *  @since   20-01-2020
 *
 ******************************************************************************/

package com.bridgelabz.scripts;

import com.bridgelabz.DataDriven.DragAndDrop;
import com.bridgelabz.base.BaseClass;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseClass
{
    @Test
    public void DragnDrop()
    {
        DragAndDrop dragAndDrop=new DragAndDrop(driver);
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        dragAndDrop.dragAnddrop();
    }
}
