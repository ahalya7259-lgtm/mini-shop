# Mini Shop — Educational E-Commerce Demo

A small full-stack e-commerce web app built with **Java 17**, **Spring Boot 3**, **Spring Security**, **Spring Data JPA**, **Thymeleaf**, and **H2**.

This is a **learning / portfolio project**. It is **not** a production store. Payments are demo-only (COD / Demo Card). No real payment gateway is integrated.

## Features

- Product catalog with categories and search
- Product detail page
- Register / login (Spring Security)
- Cart: add, update quantity, remove
- Checkout with address and payment method (demo)
- Order history for customers
- Admin dashboard: manage products, update order status
- Seeded sample products (campus essentials) and demo users

## Tech stack

| Layer | Technology |
|--------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.3 |
| Security | Spring Security (form login, BCrypt) |
| UI | Thymeleaf + simple CSS |
| Database | H2 in-memory (PostgreSQL mode; easy to switch) |
| Build | Maven |

## How to run

### Requirements

- JDK 17+
- Maven 3.9+

```bash
git clone https://github.com/ahalya7259-lgtm/mini-shop.git
cd mini-shop
mvn spring-boot:run
```

Open: **http://localhost:8080**

H2 console (optional): http://localhost:8080/h2-console  
JDBC URL: `jdbc:h2:mem:minishop`

### Demo accounts

| Username | Password  | Role     |
|----------|-----------|----------|
| admin    | admin123  | Admin    |
| demo     | demo123   | Customer |

**Change these passwords before any shared or public deployment.**

## Project structure

```text
com.minishop
├── model          # User, Product, CartItem, ShopOrder, OrderItem
├── repository     # Spring Data JPA
├── service        # Cart, Order, Product, User logic
├── controller     # Web + Admin controllers
├── security       # UserDetailsService
├── config         # Security + data seed
└── MiniShopApplication.java
```

## Screenshots

Add screenshots here after running locally:

1. Home / product grid  
2. Cart and checkout  
3. Admin dashboard  

## Architecture notes

- **Stock** is reduced when an order is placed.
- **Cart** is stored in the database per logged-in user.
- **Admin** routes require `ROLE_ADMIN`.
- **H2** is for local demo. For MySQL/PostgreSQL, change `application.yml` datasource settings and set `ddl-auto` appropriately.

## Tests

```bash
mvn test
```

Basic unit tests cover cart add, total calculation, and out-of-stock behaviour.

## Limitations

- No real payment processing
- No email notifications
- Images use placeholder URLs
- In-memory DB resets on restart
- Not hardened for production (default demo passwords, etc.)

## Future ideas

- MySQL/PostgreSQL profile
- Product image upload
- Simple sales chart on admin dashboard (Power BI export of orders CSV)
- REST API for mobile client

## License

MIT — see [LICENSE](LICENSE)

---

Built as a portfolio project by **Ahalya K** (aspiring Data Analyst & Software Developer).
