package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.CartPage;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyCartTest extends BaseTest {

    @Test
    public void emptyCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();

        productsPage.openCart();

        cartPage.removeProduct();

        Assert.assertEquals(cartPage.getCartItemsCount(), 0);
    }
}