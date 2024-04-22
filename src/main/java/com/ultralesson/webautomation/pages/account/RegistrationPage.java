package com.ultralesson.webautomation.pages.account;

import com.ultralesson.webautomation.models.User;
import com.ultralesson.webautomation.pages.BasePage;
import com.ultralesson.webautomation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id = "RegisterForm-FirstName")
    private WebElement firstNameIpEle;

    @FindBy(id ="RegisterForm-LastName")
    private WebElement lastNameIpEle;

    @FindBy(id = "RegisterForm-email")
    private WebElement emailIpEle;

    @FindBy(id = "RegisterForm-password")
    private WebElement passwordIpEle;

    @FindBy(xpath = "//input[@id='RegisterForm-password']//parent::div//following-sibling::button")
    private WebElement createButtonEle;
    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage createAccount(User user) {
        actions.type(firstNameIpEle, user.getFirstName());
        actions.type(lastNameIpEle, user.getLastName());
        actions.type(emailIpEle, user.getEmail());
        actions.type(passwordIpEle, user.getPassword());
        actions.click(createButtonEle);
//        firstNameIpEle.sendKeys(user.getFirstName());
//        lastNameIpEle.sendKeys(user.getLastName());
//        emailIpEle.sendKeys(user.getEmail());
//        passwordIpEle.sendKeys(user.getPassword());
//        createButtonEle.click();
        return new HomePage(webDriver);
    }
}
