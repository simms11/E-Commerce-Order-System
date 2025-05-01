# 🛒 E-Commerce Order System (Java 21 - OOP)

A clean, object-oriented backend simulation of an e-commerce system built using **Java 21**, designed to demonstrate solid OOP practices, clean architecture, and testable business logic without any frameworks.

---

## ✅ Features

- 👤 Role-based users: `Customer`, `Admin`
- 📦 Product inventory with stock tracking and restocking
- 🧾 Order management system with support for:
    - Multiple products
    - Discount strategies
    - Status transitions (PLACED, SHIPPED, CANCELLED)
- 💸 Discount system using Strategy pattern:
    - `FixedDiscount`
    - `PercentageDiscount`
- 🔄 Services for Inventory and Order management
- ✅ JUnit 5 tests for services and business logic

---

## 🧠 Java Concepts Demonstrated

- **Encapsulation** – private fields with public accessors
- **Inheritance** – shared logic via base class `User`
- **Abstraction** – abstract base class and interfaces
- **Polymorphism** – runtime behavior overrides (e.g., discounts, roles)
- **Composition** – objects built from other objects (`Order` contains `Product`)
- **Modern Java compatibility** – written for Java 21

---

## 🧪 Testing

JUnit 5 is used to test:

- Order total calculations
- Discount logic
- Inventory validation and stock updates
- Order lifecycle changes

Test classes are located under `src/test`.

---

## 🛠 Project Structure

```text
src/
├── main/
│   └── java/
│       └── com/
│           └── ecommerce/
│               ├── Main.java
│               ├── models/
│               │   ├── Admin.java
│               │   ├── Customer.java
│               │   ├── Order.java
│               │   ├── OrderStatus.java
│               │   ├── Product.java
│               │   └── User.java
│               ├── discounts/
│               │   ├── Discount.java
│               │   ├── FixedDiscount.java
│               │   └── PercentageDiscount.java
│               └── services/
│                   ├── InventoryService.java
│                   └── OrderService.java
├── test/
│   └── java/
│       └── com/
│           └── ecommerce/
│               └── service/
│                   ├── InventoryServiceTest.java
│                   └── OrderServiceTest.java
