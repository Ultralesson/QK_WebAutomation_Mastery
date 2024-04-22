package com.ultralesson.webautomation.pages.account;

import com.ultralesson.webautomation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    @FindBy(xpath = "//h2[text()='Account details']//following-sibling::p")
    private WebElement accountDetailsEle;
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getAccountDetails() {
        return actions.getText(accountDetailsEle);
    }
}
