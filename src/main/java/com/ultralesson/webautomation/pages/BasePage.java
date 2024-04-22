package com.ultralesson.webautomation.pages;

import com.ultralesson.webautomation.actions.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver webDriver;
    protected BaseActions actions;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
        actions = new BaseActions(webDriver);
    }

}
