package com.sukhendra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    // Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }


    // Locators
    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By removeBackpack = By.id("remove-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartIcon = By.className("shopping_cart_link");

    // Actions
    public void addBackpackToCart() {
        driver.findElement(backpack).click();
    }

    public String getCartBadgeCount() {
        return driver.findElement(cartBadge).getText();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }
    public void addBikeLightToCart() {
        driver.findElement(bikeLight).click();
    }

    public void addMultipleProducts() {
        driver.findElement(backpack).click();
        driver.findElement(bikeLight).click();
    }

    public void removeBackpackFromCart() {
        driver.findElement(removeBackpack).click();
    }
}