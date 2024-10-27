public class CalculatorModel {
    // Метод для сложения
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления с проверкой на деление на ноль
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("You can not divide number by 0");
        }
        return a / b;
    }
}
