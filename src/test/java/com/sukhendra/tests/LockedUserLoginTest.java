package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LockedUserLoginTest extends BaseTest {

    @Test
    public void lockedUserLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("locked_out_user", "secret_sauce");

        String expected = "Epic sadface: Sorry, this user has been locked out.";

        Assert.assertEquals(loginPage.getErrorMessage(), expected);
    }
}