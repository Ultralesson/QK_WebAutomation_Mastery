package com.ultralesson.webautomation.pages.account;

import com.ultralesson.webautomation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "a[href='/account/register']")
    private WebElement createAccountEle;
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public RegistrationPage navToRegistrationPage() {
        actions.click(createAccountEle);
        return new RegistrationPage(webDriver);
    }
}
