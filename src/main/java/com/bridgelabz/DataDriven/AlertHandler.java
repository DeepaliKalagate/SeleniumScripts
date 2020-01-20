package com.bridgelabz.DataDriven;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertHandler extends BaseClass
{
    @FindBy(xpath="//input[@name='proceed']")
    WebElement login;


    public void alert()
    {
        Alert alert=driver.switchTo().alert();

        alert.accept();
    }

    public AlertHandler(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="login1")
    WebElement email;
    @FindBy(id="password")
    WebElement password;


@FindBy(xpath="//input[@name='proceed']")
    WebElement login1;

    public void click()
    {
        login.click();
    }

    public void email()

    {
        email.sendKeys("DeepaliPatil210");
    }

    public void password()
    {
        password.sendKeys("Jaisai@333");
    }

    public void clickAgain()
    {
        login1.click();
    }
}
