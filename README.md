# E-Commerce Automation Testing Framework

## Project Overview

This project is an end-to-end automation testing framework developed using Selenium WebDriver, Java, TestNG, and Maven. It automates the core functionalities of the SauceDemo e-commerce website by following the Page Object Model (POM) design pattern.

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

---

## Framework Features

- Page Object Model (POM)
- BaseTest for common setup and teardown
- Explicit Wait Utility
- TestNG Test Suite
- Reusable Page Classes
- 15 Automated Test Cases

---

## Project Structure

```
src
│
├── main
│   ├── base
│   ├── pages
│   └── utils
│
└── test
    └── tests
```

---

## Automated Test Cases

### Login Module

- Valid Login
- Invalid Login
- Empty Username
- Empty Password
- Locked User Login

### Products Module

- Add Product
- Add Multiple Products
- Remove Product
- Continue Shopping

### Cart Module

- Verify Product in Cart
- Empty Cart

### Checkout Module

- Checkout Information Page
- Checkout Overview Page
- Complete Checkout

### Logout Module

- Logout

---

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Install Maven dependencies
4. Run `testng.xml`

---

## Design Pattern

- Page Object Model (POM)

---

## Author

**Sukhendra Singh**