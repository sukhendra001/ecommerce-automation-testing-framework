package com.sukhendra.pages;

import com.sukhendra.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    private WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutButton = By.id("logout_sidebar_link");

    // Actions
    public void logout() {

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(menuButton).click();

//        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
        WaitUtils.waitForElementClickable(driver, logoutButton).click();
    }
}