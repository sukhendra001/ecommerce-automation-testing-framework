package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void invalidLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "wrong_password");

        String actualError = loginPage.getErrorMessage();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError, expectedError);
    }
}