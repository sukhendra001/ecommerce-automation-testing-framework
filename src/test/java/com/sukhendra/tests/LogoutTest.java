package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {

        LoginPage loginPage = new LoginPage(driver);
        LogoutPage logoutPage = new LogoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        logoutPage.logout();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/";

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}