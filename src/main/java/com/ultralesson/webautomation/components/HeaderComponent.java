package com.ultralesson.webautomation.components;

import com.ultralesson.webautomation.pages.account.LoginPage;
import com.ultralesson.webautomation.pages.account.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BaseComponent {
    @FindBy(css = ".header__icons a[href='/account/login']")
    private WebElement loginEle;

    @FindBy(css = ".header__icons a[href='/account']")
    private WebElement profileEle;

    private By loginBy = By.cssSelector(".header__icons a[href='/account/login']");

    public HeaderComponent(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage navToLogin() {
        actions.click(loginBy);
        return new LoginPage(webDriver);
    }

    public ProfilePage navToProfile() {
        actions.click(profileEle);
        return new ProfilePage(webDriver);
    }
}
