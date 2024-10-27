import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Контроллер калькулятора, связывающий модель и представление
public class CalculatorController {
    private final CalculatorModel model; // Модель, содержащая логику калькулятора
    private final CalculatorView view; // Представление, отображающее интерфейс пользователя

    // Конструктор контроллера, принимающий модель и представление
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model; // Сохраняем ссылку на модель
        this.view = view; // Сохраняем ссылку на представление

        // Регистрация обработчиков событий для операций
        this.view.addOperationListener(new OperationListener()); // Подключаем слушателя операций
    }

    // Вложенный класс для обработки событий кнопок операций
    private class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Получаем значения из полей ввода
                double firstNumber = view.getFirstNumber(); // Первое число
                double secondNumber = view.getSecondNumber(); // Второе число
                double result = 0; // Переменная для хранения результата

                // Проверяем, какая кнопка была нажата, и выполняем соответствующую операцию
                if (e.getSource() == view.addButton) {
                    result = model.add(firstNumber, secondNumber); // Сложение
                } else if (e.getSource() == view.subtractButton) {
                    result = model.subtract(firstNumber, secondNumber); // Вычитание
                } else if (e.getSource() == view.multiplyButton) {
                    result = model.multiply(firstNumber, secondNumber); // Умножение
                } else if (e.getSource() == view.divideButton) {
                    result = model.divide(firstNumber, secondNumber); // Деление
                }

                // Отображаем результат в представлении
                view.setResult(String.valueOf(result)); // Преобразуем результат в строку и устанавливаем
            } catch (NumberFormatException ex) {
                // Обработка исключения, если введенные значения не числовые
                view.showError("You need to input numbers"); // Показать сообщение об ошибке
            } catch (ArithmeticException ex) {
                // Обработка арифметических исключений, например, деление на ноль
                view.showError(ex.getMessage()); // Показать сообщение об ошибке
            }
        }
    }
}
