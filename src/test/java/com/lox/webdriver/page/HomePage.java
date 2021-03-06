package com.lox.webdriver.page;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public static final String URL = SITE_URL + "/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage verifyHomePage() {
        verifyPage();
        return this;
    }

}
