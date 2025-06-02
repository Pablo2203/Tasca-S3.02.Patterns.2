# Patterns Project 2

## 📖 Description

This project explores software design patterns through practical examples. The goal is to better understand and implement proven structural approaches to software development.

---

### **Level 1 - Builder Pattern**
The first part involves creating a pizza ordering management system using the **Builder Design Pattern** in Java.

- A `Pizza` class is designed with the following attributes:
  - `size`: The size of the pizza.
  - `dough`: The type of dough.
  - `toppings`: The ingredients or toppings on the pizza.

- Developers implement:
  - `PizzaBuilder` interface for configuring the pizza's attributes (size, dough, toppings).
  - Concrete builder classes (`PizzaBuilder`) for specific types of pizzas like Hawaiian, Vegetarian, Pepperoni, etc.
  - A `MestrePizzer` class that accepts a concrete `PizzaBuilder` to construct various pizzas.
  
- Example usage is demonstrated in the `Main` class, showcasing the creation of pizzas with different configurations.

---

### **Level 2 - Observer Pattern**
The second part demonstrates the **Observer Design Pattern**:

- A **Stock Broker Agent (Observable)** notifies multiple **Broker Agencies (Observers)** whenever the stock value increases or decreases.
- The `Observable` object maintains references to all observers and notifies them when there is a change in the stock market conditions.

---

### **Level 3 - Callback Pattern**
The final part uses the **Callback Design Pattern** to simulate a payment gateway system.

- The gateway receives a payment method object (via encapsulation) for:
  - Credit Card
  - PayPal
  - Bank Account Transfer

- After processing the payment:
  - The gateway triggers the callback and gives control back to the originating class (e.g., the calling store, a shoe store in this case, to confirm payment success or failure).

---

## 💻 Technologies Used

- Java 24 SDK
- IntelliJ IDEA (IDE used)
- Gradle

---

## 🛠️ Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/Pablo2203/Tasca-S3.02.Patterns.2.git
   ```
2. Access the project directory:
   ```bash
   cd Tasca-S3.02.Patterns.2
   ```
3. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA).

---

## ▶️ Execution

1. Ensure the required version of Java SDK and Gradle is installed.
2. Build the project using Gradle:
   ```bash
   gradle build
   ```
3. Execute the `Main` classes for each level:
   - Level 1: Pizza Builder: `/src/level1/Main.java`
   - Level 2: Observer: `/src/level2/Main.java`
   - Level 3: Callback: `/src/level3/Main.java`

---

## 🤝 Contributions

Contributions are welcome! Follow these steps to contribute:

1. Fork this repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/NewFeature
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m 'Add NewFeature'
   ```
4. Push the changes to your branch:
   ```bash
   git push origin feature/NewFeature
   ```
5. Open a pull request explaining your changes.

---

## 🛡️ License

This project is open-source and uses an appropriate license (feel free to add the license you're using here).

---

Feel free to reach out for any questions or feedback. Enjoy exploring design patterns! 🚀
