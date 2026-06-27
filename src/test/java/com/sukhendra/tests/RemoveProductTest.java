package com.sukhendra.tests;

import com.sukhendra.base.BaseTest;
import com.sukhendra.pages.LoginPage;
import com.sukhendra.pages.ProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProductTest extends BaseTest {

    @Test
    public void removeProductTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();

        productsPage.removeBackpackFromCart();

        int badge = driver.findElements(By.className("shopping_cart_badge")).size();

        Assert.assertEquals(badge, 0);
    }
}