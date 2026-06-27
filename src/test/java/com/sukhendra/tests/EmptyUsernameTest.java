package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyUsernameTest extends BaseTest {

    @Test
    public void emptyUsernameTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("", "secret_sauce");

        String expected =
                "Epic sadface: Username is required";

        Assert.assertEquals(loginPage.getErrorMessage(), expected);
    }
}