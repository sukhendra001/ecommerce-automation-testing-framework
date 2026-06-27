package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyPasswordTest extends BaseTest {

    @Test
    public void emptyPasswordTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "");

        String expected = "Epic sadface: Password is required";

        Assert.assertEquals(loginPage.getErrorMessage(), expected);
    }
}