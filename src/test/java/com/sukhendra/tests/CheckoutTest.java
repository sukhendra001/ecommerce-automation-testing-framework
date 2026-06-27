package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.CartPage;
import com.sukhendra.pages.CheckoutPage;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();

        productsPage.openCart();

        cartPage.clickCheckout();

        checkoutPage.checkout("Sukhendra", "Singh", "452001");

        Assert.assertEquals(checkoutPage.getSuccessMessage(),
                "Thank you for your order!");
    }
}