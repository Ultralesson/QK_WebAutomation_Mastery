package com.ultralesson.webautomation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseActions {

    private WebDriverWait webDriverWait;

    public BaseActions(WebDriver webDriver) {
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void click(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element))
                .click();
    }

    public void click(By by) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by))
                .click();
    }

    public void type(WebElement element, String value) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element))
                .sendKeys(value);
    }

    public String getText(WebElement webElement) {
        return webDriverWait.until(ExpectedConditions.visibilityOf(webElement))
                .getText();
    }
}

