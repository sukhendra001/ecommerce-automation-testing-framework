package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMultipleProductsTest extends BaseTest {

    @Test
    public void addMultipleProductsTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addMultipleProducts();

        Assert.assertEquals(productsPage.getCartBadgeCount(), "2");
    }
}