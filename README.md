# Bank Account Management System

A Java console application demonstrating object-oriented programming (OOP) principles through a simple Bank Account management system.

## 📌 Project Overview

This project implements a `BankAccount` class that models basic banking operations such as checking account details, depositing funds, and withdrawing funds with proper input validation.

## ✨ Features

- **Account Details Display**: View account number, cardholder name, and current balance.
- **Deposit Funds**: Add money to the account balance with validation against invalid or non-positive amounts.
- **Withdraw Funds**: Withdraw money with checks for invalid amounts and insufficient balance.
- **Encapsulation**: Private fields (`accountNumber`, `holderName`, `balance`) exposed safely via public methods.

## 📁 Project Structure

```text
java intership/
├── BankAccount.java    # Source code containing BankAccount class and main method
└── README.md           # Project documentation
```

## 🛠️ Prerequisites

- Java Development Kit (JDK) 8 or higher installed.
- Terminal / Command Prompt with `javac` and `java` available in PATH.

## 🚀 How to Run

1. **Open Terminal / Command Prompt** in the project directory:
   ```bash
   cd "java intership"
   ```

2. **Compile the Java Program**:
   ```bash
   javac BankAccount.java
   ```

3. **Run the Application**:
   ```bash
   java BankAccount
   ```

## 💻 Sample Output

```text
Account Number: 123456789
Holder Name: Siva Sekhar
Balance: ₹5000.0

--- Deposit ---
Deposited: ₹2000.0
Current Balance: ₹7000.0

--- Withdrawal ---
Withdrawn: ₹1500.0
Current Balance: ₹5500.0

--- Final Account Details ---
Account Number: 123456789
Holder Name: Siva Sekhar
Balance: ₹5500.0
```
