//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();

        // Примеры тестов
        System.out.println("Сложение 5 + 3 = " + model.add(5, 3));
        System.out.println("Вычитание 10 - 4 = " + model.subtract(10, 4));
        System.out.println("Умножение 6 * 7 = " + model.multiply(6, 7));

        // Проверка деления
        try {
            System.out.println("Деление 20 / 4 = " + model.divide(20, 4));
            System.out.println("Деление 10 / 0 = " + model.divide(10, 0)); // Должна вызвать исключение
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
