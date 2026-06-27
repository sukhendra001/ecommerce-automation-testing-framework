package com.sukhendra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By cartItem = By.className("inventory_item_name");
    private By removeButton = By.id("remove-sauce-labs-backpack");
    private By checkoutButton = By.id("checkout");
    private By continueShoppingButton = By.id("continue-shopping");
    private By cartItems = By.className("cart_item");

    // Actions
    public String getProductName() {
        return driver.findElement(cartItem).getText();
    }

    public void removeProduct() {
        driver.findElement(removeButton).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    public int getCartItemsCount() {
        return driver.findElements(cartItems).size();
    }
}