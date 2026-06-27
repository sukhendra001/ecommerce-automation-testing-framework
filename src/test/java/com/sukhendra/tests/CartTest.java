package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.CartPage;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void verifyProductInCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();

        productsPage.openCart();

        Assert.assertEquals(cartPage.getProductName(), "Sauce Labs Backpack");
    }
}