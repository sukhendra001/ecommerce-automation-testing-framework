package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.CartPage;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContinueShoppingTest extends BaseTest {

    @Test
    public void continueShoppingTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();

        productsPage.openCart();

        cartPage.clickContinueShopping();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}