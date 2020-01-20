package com.bridgelabz.DataDriven;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop extends BaseClass
{
    //Element which needs to drag.
    @FindBy(xpath="//*[@id='credit2']/a")
    WebElement sourcePath;
    //Element on which need to drop.
    @FindBy(xpath="//*[@id='bank']/li")
    WebElement destinationPath;

    public DragAndDrop(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void dragAnddrop()
    {
        //Using Action class for drag and drop.
        Actions actions=new Actions(driver);
        //Dragged and dropped.
        actions.dragAndDrop(sourcePath,destinationPath).build().perform();
    }
}
