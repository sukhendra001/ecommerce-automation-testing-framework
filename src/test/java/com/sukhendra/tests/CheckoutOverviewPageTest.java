package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.CartPage;
import com.sukhendra.pages.CheckoutPage;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutOverviewPageTest extends BaseTest {

    @Test
    public void checkoutOverviewPageTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();

        productsPage.openCart();

        cartPage.clickCheckout();

        checkoutPage.enterFirstName("Sukhendra");
        checkoutPage.enterLastName("Singh");
        checkoutPage.enterPostalCode("452001");
        checkoutPage.clickContinue();

        String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}