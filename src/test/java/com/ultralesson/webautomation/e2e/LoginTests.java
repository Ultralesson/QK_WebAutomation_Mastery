package com.ultralesson.webautomation.e2e;

import com.ultralesson.webautomation.models.User;
import com.ultralesson.webautomation.pages.HomePage;
import com.ultralesson.webautomation.pages.account.LoginPage;
import com.ultralesson.webautomation.pages.account.ProfilePage;
import com.ultralesson.webautomation.pages.account.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(testName = "User Registration", description = "Verify that a new user is able to register")
    public void verifyThatANewUserIsAbleToRegister() throws InterruptedException {
        //arrange

        //Big Assumption that tests will work based on elements are available
        User user = User.builder().build().init();
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();
        RegistrationPage registrationPage = loginPage.navToRegistrationPage();
        //act
        homePage = registrationPage.createAccount(user);
        ProfilePage profilePage = homePage.getHeader().navToProfile();
        String accountDetails = profilePage.getAccountDetails();

        //assert
        Assert.assertTrue(accountDetails.contains(String.format("%s %s", user.getFirstName(),user.getLastName())));
    }
}
