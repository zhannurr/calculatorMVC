# 🧮 My Calculator App 🧮

Welcome to my adorable Calculator App! 🌟 This little project showcases the Model-View-Controller (MVC) design pattern while providing a simple and user-friendly interface for basic arithmetic operations. 💖

## 💻 Features

- **Basic Operations:** Perform addition (+), subtraction (−), multiplication (×), and division (÷) with ease! ✨
- **User-Friendly Interface:** Clean and intuitive layout using Java Swing, designed with love! 🥰
- **Error Handling:** Friendly messages for division by zero and invalid input, ensuring a smooth experience. 🚫➗

## 📜 How It Works

The app is divided into three components following the MVC design pattern:

1. **Model (CalculatorModel):** This component handles all the calculations and business logic. It defines the operations and ensures that only valid calculations are performed. For example, it checks for division by zero before performing the division. 💡

2. **View (CalculatorView):** The charming interface that allows users to input numbers and see results. It's designed to be welcoming and easy to use! The view displays the result and communicates errors to the user through friendly pop-up messages. 🌈

3. **Controller (CalculatorController):** The glue that connects the model and view! The controller manages user interactions, responds to button clicks, and updates the view with results or error messages. It ensures that the model's calculations are displayed correctly in the view. 🎩

This separation of concerns helps keep the code organized and maintainable, making it easier to expand the application in the future! 🌟

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone git@github.com:zhannurr/calculatorSDP.git
   ```
2. Navigate to the project directory:
   ```bash
   cd calculatorSDP
   ```
3. Compile and run the application:
   ```bash
   javac CalculatorApp.java
   java CalculatorApp
   ```

## 🎉 Enjoy Using My Calculator!

Feel free to play around with the app and perform calculations!💕

---

Let me know if you’d like to add anything else! 😊
