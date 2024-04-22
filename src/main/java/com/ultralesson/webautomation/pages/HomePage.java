package com.ultralesson.webautomation.pages;

import com.ultralesson.webautomation.components.HeaderComponent;
import com.ultralesson.webautomation.pages.account.LoginPage;
import com.ultralesson.webautomation.pages.account.ProfilePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private HeaderComponent headerComponent;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.headerComponent = new HeaderComponent(webDriver);
    }

    public HeaderComponent getHeader() {
        return headerComponent;
    }


}
