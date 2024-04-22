package com.ultralesson.webautomation.e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private final String URL = "https://web-playground.ultralesson.com/";

    protected ThreadLocal<WebDriver> webDriverThreadLocal;

    @BeforeMethod
    public void setup() {
        webDriverThreadLocal = new ThreadLocal<>();
        webDriverThreadLocal.set(new ChromeDriver());
        launch();
    }

    @AfterMethod
    public void tearDown() {
        webDriverThreadLocal.get().quit();
    }

    protected WebDriver getWebDriver() {
        return webDriverThreadLocal.get();
    }

    protected void launch() {
        getWebDriver().get(URL);
    }
}
